package a_strategy.impl;

import a_strategy.FlyBehavior;

/**
 * Created by ll on 04/02/2018.
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can't fly");
    }
}
