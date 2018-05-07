package f_common;

import f_common.impl.*;
import f_common.model.Light;
import f_common.model.Stereo;

/**
 * Created by ll on 07/05/2018.
 */
public class RemoteMacroCommand {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living room");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};

        MacroCommand macroCommand = new MacroCommand(partyOn);
        MacroCommand macroCommand1 = new MacroCommand(partyOff);

        remoteControl.setCommand(0, macroCommand, macroCommand1);


        remoteControl.onButtonWasPushed(0);
        System.out.println("---------------");
        remoteControl.offButtionWasPushed(0);
    }
}
