package com.pattern.hfdp.command;

import com.pattern.hfdp.command.Service.*;
import com.pattern.hfdp.command.bean.CeilingFan;
import com.pattern.hfdp.command.bean.GarageDoor;
import com.pattern.hfdp.command.bean.Light;
import com.pattern.hfdp.command.bean.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen light");


        CeilingFan livingRmCFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRmCFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRmCFan);

        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenRoomLightOff);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,stereoOnWithCDCommand,stereoOffCommand);
        remoteControl.setCommand(4,garageDoorOnCommand,garageDoorOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);


    }
}
