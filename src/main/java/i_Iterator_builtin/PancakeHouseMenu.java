package i_Iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ll on 16/05/2018.
 */
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K & B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Regular Pancake Breakfast", false, 3.99);
        addItem("Blueberry Pancakes", "Blueberry Pancakes", true, 4.99);
        addItem("Waffles", "Waffles", true, 5.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
