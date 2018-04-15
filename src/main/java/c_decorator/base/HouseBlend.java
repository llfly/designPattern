package c_decorator.base;

import c_decorator.Beverage;

/**
 * Created by ll on 15/04/2018.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
