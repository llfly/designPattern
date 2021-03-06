package f_common.impl;

import f_common.Command;
import f_common.model.Light;

/**
 * Created by ll on 06/05/2018.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
