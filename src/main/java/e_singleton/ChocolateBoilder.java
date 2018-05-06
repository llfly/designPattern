package e_singleton;

/**
 * Created by ll on 06/05/2018.
 */
public class ChocolateBoilder {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilder chocolateBoilder;


    private ChocolateBoilder() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilder getInstance() {
        if (chocolateBoilder == null) {
            chocolateBoilder = new ChocolateBoilder();
        }
        return chocolateBoilder;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }


    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
