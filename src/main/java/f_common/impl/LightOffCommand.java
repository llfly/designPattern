package f_common.impl;

import f_common.Command;
import f_common.model.Light;

/**
 * Created by ll on 07/05/2018.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
