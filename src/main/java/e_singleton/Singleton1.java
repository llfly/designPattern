package e_singleton;

/**
 * Created by ll on 06/05/2018.
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() { // 存在性能问题
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
