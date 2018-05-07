package f_common.model;

/**
 * Created by ll on 07/05/2018.
 */
public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo is On");
    }

    public void setCD() {
        System.out.println("Stereo setCD");
    }

    public void setVolume(int number) {
        System.out.println("Stereo setVolume " + number);
    }

    public void off() {
        System.out.println("Stereo is Off");
    }
}
