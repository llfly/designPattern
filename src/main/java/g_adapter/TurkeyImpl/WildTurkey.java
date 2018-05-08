package g_adapter.TurkeyImpl;

import g_adapter.Turkey;

/**
 * Created by ll on 08/05/2018.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
