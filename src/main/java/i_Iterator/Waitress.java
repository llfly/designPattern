package i_Iterator;

import i_Iterator.*;
import i_Iterator.DinerMenu;

/**
 * Created by ll on 17/05/2018.
 */
public class Waitress {
    i_Iterator.PancakeHouseMenu pancakeHouseMenu;
    i_Iterator.DinerMenu dinerMenu;

    public Waitress(i_Iterator.PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ",");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
