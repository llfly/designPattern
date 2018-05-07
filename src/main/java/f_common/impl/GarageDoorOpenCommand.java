package f_common.impl;

import f_common.Command;
import f_common.model.GarageDoor;

/**
 * Created by ll on 06/05/2018.
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightOff();
    }
}
