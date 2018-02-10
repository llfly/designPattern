package a_strategy.impl;

import a_strategy.Duck;

/**
 * Created by ll on 04/02/2018.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
