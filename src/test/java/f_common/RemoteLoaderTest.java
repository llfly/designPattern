package f_common;

import f_common.impl.CeilingFanHighCommand;
import f_common.impl.CeilingFanMediumCommand;
import f_common.impl.CeilingFanOffCommand;
import f_common.model.CeilingFan;

/**
 * Created by ll on 07/05/2018.
 */
public class RemoteLoaderTest {
    public static void main(String [] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);


        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtionWasPushed(0);
        //System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        //System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
