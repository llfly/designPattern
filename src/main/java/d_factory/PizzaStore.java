package d_factory;

/**
 * Created by ll on 23/04/2018.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();

        return pizza;
    }
}
