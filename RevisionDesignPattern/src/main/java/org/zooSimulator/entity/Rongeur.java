package org.zooSimulator.entity;

import org.zooSimulator.factory.RongeurFactory;

public class Rongeur extends Animal{
    public Rongeur(String nom) {
        super(nom, new RongeurFactory());
    }
}
