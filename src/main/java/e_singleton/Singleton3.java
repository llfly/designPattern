package e_singleton;

/**
 * Created by ll on 06/05/2018.
 */
public class Singleton3 { // 双重检查加锁 double-checked locking
    private volatile static Singleton3 uniqueInstance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }

}
