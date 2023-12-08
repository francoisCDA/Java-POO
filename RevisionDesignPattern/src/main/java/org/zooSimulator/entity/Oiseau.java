package org.zooSimulator.entity;

import org.zooSimulator.factory.AnimalFactory;
import org.zooSimulator.factory.OiseauxFactory;

public class Oiseau extends Animal{
    public Oiseau(String nom) {
        super(nom, new OiseauxFactory());
    }
}
