package d_factory.storeImpl;

import d_factory.Pizza;
import d_factory.PizzaStore;
import d_factory.pizzaImpl.ChicagoStyleCheesePizza;

/**
 * Created by ll on 25/04/2018.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
