package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
