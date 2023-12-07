package org.zooSimulator;

import org.zooSimulator.interfacesObserver.Observator;

public class Visiteur implements Observator {

    private static int cmptBillet = 0;
    private int numeroDeBillet ;

    public Visiteur() {
        numeroDeBillet = ++cmptBillet;
    }

    @Override
    public void updateActivite(Animal animal) {

    }
}
