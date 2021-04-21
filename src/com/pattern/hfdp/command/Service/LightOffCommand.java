package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }
}
