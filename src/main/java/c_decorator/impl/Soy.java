package c_decorator.impl;

import c_decorator.Beverage;
import c_decorator.CondimentDecorator;
import c_decorator.Size;

/**
 * Created by ll on 15/04/2018.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case TALL:
                cost += 0.8;
                break;
            case GRANDE:
                cost += 0.85;
                break;
            case VENTI:
                cost += 0.9;
                break;
        }

        return cost;
    }
}
