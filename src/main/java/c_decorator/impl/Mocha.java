package c_decorator.impl;

import c_decorator.Beverage;
import c_decorator.CondimentDecorator;
import c_decorator.Size;

/**
 * Created by ll on 15/04/2018.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case TALL:
                cost += 0.1;
                break;
            case GRANDE:
                cost += 0.15;
                break;
            case VENTI:
                cost += 0.2;
                break;
        }

        return cost;
    }
}
