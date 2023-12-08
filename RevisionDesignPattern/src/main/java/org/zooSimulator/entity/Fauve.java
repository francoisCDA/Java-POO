package org.zooSimulator.entity;


import org.zooSimulator.factory.FauveFactory;

public class Fauve extends Animal {

    public Fauve(String nom) {
        super(nom, new FauveFactory());
    }
}
