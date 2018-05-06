package f_common.impl;

import f_common.Command;
import f_common.Light;

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
}
