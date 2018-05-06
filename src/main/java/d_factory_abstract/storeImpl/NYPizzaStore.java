package d_factory_abstract.storeImpl;

import d_factory_abstract.Pizza;
import d_factory_abstract.PizzaStore;
import d_factory_abstract.IngredientImpl.NYPizzaIngredientFactory;
import d_factory_abstract.PizzaIngredientFactory;
import d_factory_abstract.pizzaImpl.CheesePizza;
import d_factory_abstract.pizzaImpl.ClamPizza;

/**
 * Created by ll on 05/05/2018.
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        
        return pizza;
    }
}
