package interview.exercises.two;

/**
 * 使用枚举 单例特性
 */
public enum  Singleton5 {
    INSTANCE;

    private Object resource;

    Singleton5() {
        resource = new Object();
    }

    public static Singleton5 getInstance(){
        return INSTANCE;
    }
}
