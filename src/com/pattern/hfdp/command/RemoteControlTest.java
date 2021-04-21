package com.pattern.hfdp.command;

import com.pattern.hfdp.command.Service.LightOnCommand;
import com.pattern.hfdp.command.bean.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("leaving room");
        LightOnCommand lighton = new LightOnCommand(light);
        remote.setCommand(lighton);
        remote.bottonWasPressed();
    }
}
