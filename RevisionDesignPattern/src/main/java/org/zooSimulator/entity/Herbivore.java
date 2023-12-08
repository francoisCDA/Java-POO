package org.zooSimulator.entity;


import org.zooSimulator.factory.HerbivoreFactory;

public class Herbivore extends Animal{
    public Herbivore(String nom) {
        super(nom, new HerbivoreFactory());
    }
}
