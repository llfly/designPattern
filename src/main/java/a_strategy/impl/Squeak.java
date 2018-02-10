package a_strategy.impl;

import a_strategy.QuackBehavior;

/**
 * Created by ll on 04/02/2018.
 */
public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
