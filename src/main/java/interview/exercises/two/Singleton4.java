package interview.exercises.two;

/**
 * 双重枷锁
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
