package f_common.model;

/**
 * Created by ll on 06/05/2018.
 */
public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up(){
        System.out.println("GarageDoor is up");
    }

    public void down(){
        System.out.println("GarageDoor is down");
    }

    public void stop() {System.out.println("GarageDoor is stop");}

    public void lightOn(){

    }

    public void lightOff(){

    }
}
