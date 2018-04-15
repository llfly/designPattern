package c_decorator.base;

import c_decorator.Beverage;

/**
 * Created by ll on 15/04/2018.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
