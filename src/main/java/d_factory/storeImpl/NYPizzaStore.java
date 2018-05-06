package d_factory.storeImpl;

import d_factory.Pizza;
import d_factory.PizzaStore;
import d_factory.pizzaImpl.NYStyleCheesePizza;
import d_factory.pizzaImpl.NYStyleVeggiePizza;

/**
 * Created by ll on 25/04/2018.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
