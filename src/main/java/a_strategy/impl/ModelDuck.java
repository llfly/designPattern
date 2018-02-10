package a_strategy.impl;

import a_strategy.Duck;

/**
 * Created by ll on 04/02/2018.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}
