package org.zooSimulator.interfacesObserver;

import org.zooSimulator.Visiteur;

public interface Subject {

    void registerObservator(Visiteur visiteur);

    void removeObservator(Visiteur visiteur);

    void notifyObservator(String info);

}
