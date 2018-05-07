package f_common;

import f_common.impl.*;
import f_common.model.GarageDoor;
import f_common.model.Light;
import f_common.model.Stereo;

/**
 * Created by ll on 07/05/2018.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);


        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorCloseCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        for (int i = 0; i < 4; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtionWasPushed(i);
            System.out.println("------------------");
            remoteControl.undoButtonWasPushed();
            System.out.println("------------------");
        }


    }
}
