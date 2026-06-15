package com.guisfco.creational.prototype;

public class Main {

    static void main() {
        var iPhone = new IPhone(6, 4, 8, true);
        var newIphone = iPhone.clone();
        IO.println("Instance 1: " + iPhone);
        IO.println("Instance 2: " + newIphone);
        IO.println("Same instance: " + (iPhone == newIphone));

        var samsung = new Samsung(6, 6, 12, true);
        var newSamsung = samsung.clone();
        IO.println("Instance 1: " + samsung);
        IO.println("Instance 2: " + newSamsung);
        IO.println("Same instance: " + (samsung == newSamsung));
    }
}
