package f_common;

import f_common.impl.GarageDoorOpenCommand;
import f_common.impl.LightOnCommand;
import f_common.model.GarageDoor;
import f_common.model.Light;

/**
 * Created by ll on 06/05/2018.
 */
public class RemoteControlTest {
    public static void main(String [] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light("test");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("test");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setSlot(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
