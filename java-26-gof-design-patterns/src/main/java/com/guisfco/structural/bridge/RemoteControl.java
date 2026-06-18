package com.guisfco.structural.bridge;

public class RemoteControl implements Remote {

    private final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        if (device.isOn()) {
            device.volumeUp();
        }
    }

    @Override
    public void volumeDown() {
        if (device.isOn()) {
            device.volumeDown();
        }
    }
}
