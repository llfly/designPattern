package a_strategy;

import a_strategy.impl.FlyRocketPowered;
import a_strategy.impl.MallardDuck;
import a_strategy.impl.ModelDuck;

/**
 * Created by ll on 04/02/2018.
 */
public class MiniDuckSimulator {
    public static void main(String [] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
