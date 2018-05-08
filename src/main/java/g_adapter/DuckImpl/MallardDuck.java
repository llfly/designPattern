package g_adapter.DuckImpl;

import g_adapter.Duck;

/**
 * Created by ll on 08/05/2018.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
