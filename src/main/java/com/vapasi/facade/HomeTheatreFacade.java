package com.vapasi.facade;

public class HomeTheatreFacade {
    Amplifier amplifier;
    Projector projector;
    DVD dvd;

    public HomeTheatreFacade(Amplifier amplifier, Projector projector, DVD dvd){
        this.amplifier = amplifier;
        this.projector = projector;
        this.dvd = dvd;
    }

    public void playDVD(){
        dvd.on();
        projector.on();
        amplifier.on();
    }
}
