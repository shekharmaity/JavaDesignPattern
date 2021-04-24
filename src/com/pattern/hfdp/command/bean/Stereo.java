package com.pattern.hfdp.command.bean;

public class Stereo {
    String place;

    public Stereo(String place){
        this.place = place;
    }

    public void on(){
        System.out.println("Stereo is on : "+place);
    }

    public void off(){
        System.out.println("Stereo is off : "+place);
    }

    public void setCD(){
        System.out.println("CD has been set : " +place);
    }

    public void setVolume(Integer level){
        System.out.println(place+" volumne set on level : "+level);
    }
}
