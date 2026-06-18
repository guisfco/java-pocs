package com.guisfco.creational.abstractfactory;

public class Main {

    static void main() {
        var macOS = new OperationalSystem(new MacOSFactory());
        macOS.paint();

        var windows = new OperationalSystem(new WindowsFactory());
        windows.paint();
    }
}
