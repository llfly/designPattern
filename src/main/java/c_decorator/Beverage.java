package c_decorator;

/**
 * Created by ll on 15/04/2018.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
