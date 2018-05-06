package d_factory_abstract;

import d_factory_abstract.storeImpl.NYPizzaStore;

/**
 * Created by ll on 25/04/2018.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
