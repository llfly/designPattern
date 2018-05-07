package f_common;

import f_common.Command;

import java.util.Arrays;

/**
 * Created by ll on 07/05/2018.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        //Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }

        undoCommand = null;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }

    }

    public void offButtionWasPushed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }


    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            if (onCommands[i] != null && offCommands[i] != null) {
                stringBuffer.append("[slot " + i +"] " + onCommands[i].getClass().getName()
                        + "     " + offCommands[i].getClass().getName() + "\n");
            }
        }

        return stringBuffer.toString();
    }
}