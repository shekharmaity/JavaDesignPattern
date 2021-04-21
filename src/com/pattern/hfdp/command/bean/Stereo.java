package com.pattern.hfdp.command.bean;

public class Stereo {
    public void on(){
        System.out.println("Stereo is on");
    }

    public void off(){
        System.out.println("Stereo is off");
    }

    public void setCD(){
        System.out.println("CD has been set");
    }

    public void setVolume(Integer level){
        System.out.println("volumne set on level : "+level);
    }
}
