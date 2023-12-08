package org.zooSimulator.entity;

import org.zooSimulator.factory.AnimalFactory;
import org.zooSimulator.factory.SerpentFactory;

public class Serpent extends Animal{
    public Serpent(String nom) {
        super(nom, new SerpentFactory());
    }
}
