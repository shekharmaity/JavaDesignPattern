package com.pattern.hfdp.command;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i = 0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i]= noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RemoteControl{");
        sb.append("onCommand=").append(onCommands == null ? "null" : Arrays.asList(onCommands).toString());
        sb.append(", offCommand=").append(offCommands == null ? "null" : Arrays.asList(offCommands).toString());
        sb.append('}');
        return sb.toString();
    }
}
