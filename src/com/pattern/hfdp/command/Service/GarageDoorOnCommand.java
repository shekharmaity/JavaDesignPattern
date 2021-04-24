package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.GarageDoor;

public class GarageDoorOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }
}
