package com.vapasi.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        DVD dvd = new DVD();
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amplifier, projector, dvd);

        homeTheatreFacade.playDVD();
    }
}


//Law of Demeter