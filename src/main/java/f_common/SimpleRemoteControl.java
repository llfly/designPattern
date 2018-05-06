package f_common;

/**
 * Created by ll on 06/05/2018.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
}
