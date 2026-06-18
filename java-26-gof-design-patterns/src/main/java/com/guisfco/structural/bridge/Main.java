package com.guisfco.structural.bridge;

public class Main {

    static void main() {
        var television = new Television();
        var remoteControl = new RemoteControl(television);
        var firestickRemoteControl = new FirestickRemoteControl(television);

        remoteControl.volumeUp(); // ignored because TV is off
        remoteControl.power();
        firestickRemoteControl.volumeUp();
        firestickRemoteControl.volumeUp();
        firestickRemoteControl.openNetflix();
        firestickRemoteControl.power();

        var radio = new Radio();
        var radioRemoteControl = new RemoteControl(radio);

        radioRemoteControl.power();
        radioRemoteControl.volumeUp();
    }
}
