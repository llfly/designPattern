package g_adapter;

import g_adapter.DuckImpl.MallardDuck;
import g_adapter.TurkeyImpl.WildTurkey;

/**
 * Created by ll on 08/05/2018.
 */
public class DuckTestDrive {
    public static void main(String [] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();


        testDuck(duck);

        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
