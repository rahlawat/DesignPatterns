package com.vapasi.command;

import org.omg.PortableServer.LifespanPolicyOperations;

//receiver
public class Light {

    private boolean isOn = false;

    public void toggle() {
        if(isOn){
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light Switched on");
    }

    public void off(){
        System.out.println("Light Switched off");
    }
}
