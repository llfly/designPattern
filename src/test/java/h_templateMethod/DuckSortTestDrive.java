package h_templateMethod;

import java.util.Arrays;

/**
 * Created by ll on 15/05/2018.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck [] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey",2),
                new Duck("Howard",7)
        };
        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }


    public static void display(Duck[] ducks) {
        for(int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }

}
