package com.guisfco.structural.bridge;

public class FirestickRemoteControl extends RemoteControl {

    public FirestickRemoteControl(Device device) {
        super(device);
    }

    public void openNetflix() {
        IO.println("Opening Netflix");
    }

    public void openPrimeVideo() {
        IO.println("Opening Prime Video");
    }
}
