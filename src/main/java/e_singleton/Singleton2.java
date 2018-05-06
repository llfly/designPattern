package e_singleton;

/**
 * Created by ll on 06/05/2018.
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2(); // 不用延迟实例化做法

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}

