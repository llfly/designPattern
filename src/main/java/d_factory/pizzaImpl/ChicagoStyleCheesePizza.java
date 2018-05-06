package d_factory.pizzaImpl;

import d_factory.Pizza;

/**
 * Created by ll on 25/04/2018.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cute(){
        System.out.println("Cutting the pizza into square slices");
    }
}
