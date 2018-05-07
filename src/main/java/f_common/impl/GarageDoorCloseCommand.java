package f_common.impl;

import f_common.Command;
import f_common.model.GarageDoor;

/**
 * Created by ll on 07/05/2018.
 */
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
