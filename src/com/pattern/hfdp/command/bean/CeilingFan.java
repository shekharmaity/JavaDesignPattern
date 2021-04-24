package com.pattern.hfdp.command.bean;

public class CeilingFan {

    String place;
    public CeilingFan(String place){
        this.place= place;
    }
    public void on(){
        System.out.println(place +" CeilingFan on");
    }

    public void off(){
        System.out.println(place +" CeilingFan off");
    }
}
