package i_Iterator_builtin;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ll on 19/05/2018.
 */
public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad",true, 3.69);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
