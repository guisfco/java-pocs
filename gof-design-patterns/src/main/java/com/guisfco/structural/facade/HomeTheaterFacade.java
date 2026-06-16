package com.guisfco.structural.facade;

public record HomeTheaterFacade(Television television,
                                SoundSystem soundSystem,
                                StreamingPlayer streamingPlayer) {

    public void watchMovie(String movie) {
        television.turnOn();
        television.setInput("HDMI");

        soundSystem.turnOn();
        soundSystem.setVolume(20);

        streamingPlayer.turnOn();
        streamingPlayer.play(movie);
    }
}