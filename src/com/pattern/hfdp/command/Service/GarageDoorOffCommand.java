package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.GarageDoor;

public class GarageDoorOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }
}
