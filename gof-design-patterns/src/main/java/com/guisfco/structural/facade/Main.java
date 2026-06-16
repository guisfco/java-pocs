package com.guisfco.structural.facade;

public class Main {

    static void main() {
        var homeTheaterFacade = new HomeTheaterFacade(new Television(), new SoundSystem(), new StreamingPlayer());
        homeTheaterFacade.watchMovie("Interstellar");
    }
}
