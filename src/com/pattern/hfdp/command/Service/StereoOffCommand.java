package com.pattern.hfdp.command.Service;

import com.pattern.hfdp.command.Command;
import com.pattern.hfdp.command.bean.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
