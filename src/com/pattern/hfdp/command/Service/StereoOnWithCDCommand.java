package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);

    }
}
