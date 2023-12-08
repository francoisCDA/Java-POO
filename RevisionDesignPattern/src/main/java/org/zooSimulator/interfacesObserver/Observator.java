package org.zooSimulator.interfacesObserver;

import org.zooSimulator.entity.Animal;

public interface Observator<T> {

    void updateActivite(T sujet);

}
