package interview.exercises.two;

/**
 * 饿汉式 利用类加载时期进行初始化，但失去了延迟加载的特性
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
