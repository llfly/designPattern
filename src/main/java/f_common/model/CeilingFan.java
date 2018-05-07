package f_common.model;

/**
 * Created by ll on 07/05/2018.
 */
public class CeilingFan {
    public static final int HGIH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HGIH;
        System.out.println(location + "ceilingFan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "ceilingFan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "ceilingFan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "ceilingFan is on off");
    }

    public int getSpeed() {
        return speed;
    }

}
