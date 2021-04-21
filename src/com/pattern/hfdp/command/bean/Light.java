package com.pattern.hfdp.command.bean;

public class Light {
String place;
public Light(String place){
    this.place= place;
}
    public void on(){
        System.out.println(place +" light on");
    }

    public void off(){
        System.out.println(place +" light off");
    }
}
