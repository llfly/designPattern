package d_factory_simply;

import d_factory.Pizza;
import d_factory.pizzaImpl.NYStyleCheesePizza;
import d_factory.pizzaImpl.NYStyleVeggiePizza;

/**
 * Created by ll on 23/04/2018.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie"))
            pizza = new NYStyleVeggiePizza();

        return pizza;
    }
}
