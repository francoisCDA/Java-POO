package org.zooSimulator.interfacesObserver;


public interface Subject<T> {

    void registerObservator(Observator<T> observer);

    void removeObservator(Observator<T> observer);

    void notifyObservators(T info);

}
