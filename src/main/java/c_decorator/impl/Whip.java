package c_decorator.impl;

import c_decorator.Beverage;
import c_decorator.CondimentDecorator;
import c_decorator.Size;

/**
 * Created by ll on 15/04/2018.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case TALL:
                cost += 0.2;
                break;
            case GRANDE:
                cost += 0.25;
                break;
            case VENTI:
                cost += 0.3;
                break;
        }

        return cost;
    }
}
