package i_Iterator;

/**
 * Created by ll on 16/05/2018.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem [] menuItems;

    public DinerMenu(int numberOfItems) {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Hotdog", "Hotdog", false, 3.99);
        addItem("Soup of the day", "Soup of the day", false, 4.99);
        addItem("BLT", "BLT", true, 5.99);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }
}
