package interview.exercises.two;

/**
 * 懒汉式(线程安全）
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance2() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
