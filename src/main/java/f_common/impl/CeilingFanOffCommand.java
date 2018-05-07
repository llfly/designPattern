package f_common.impl;

import f_common.Command;
import f_common.model.CeilingFan;

/**
 * Created by ll on 07/05/2018.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpped;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpped = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpped) {
            case CeilingFan.HGIH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
