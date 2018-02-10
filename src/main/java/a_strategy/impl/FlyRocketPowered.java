package a_strategy.impl;

import a_strategy.FlyBehavior;

/**
 * Created by ll on 04/02/2018.
 */
public class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
