package org.zooSimulator.entity;


import lombok.Data;
import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.factory.AnimalFactory;
import org.zooSimulator.interfacesObserver.Observator;
import org.zooSimulator.interfacesObserver.Subject;

import java.util.ArrayList;

@Data
public abstract class Animal implements Subject<Animal> {

    private String nom;

    private ArrayList<Observator<Animal>> visiteurs ;

    private AnimalActivity activite;


    public Animal(String nom, AnimalFactory animalFactory) {
        visiteurs = new ArrayList<>();
        this.nom = nom;
        activite = animalFactory.createActivity();
    }

    @Override
    public void registerObservator(Observator<Animal> observer) {
        visiteurs.add(observer);
    }

    @Override
    public void removeObservator(Observator<Animal> observer) {
        visiteurs.remove(observer);
    }

    @Override
    public void notifyObservators(Animal activity) {
        visiteurs.forEach( o -> o.updateActivite(this));
    }

}
