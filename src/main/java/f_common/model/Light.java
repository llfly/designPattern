package f_common.model;

/**
 * Created by ll on 06/05/2018.
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " light is On");
    }

    public void off(){
        System.out.println(name + " light is Off");
    }
}
