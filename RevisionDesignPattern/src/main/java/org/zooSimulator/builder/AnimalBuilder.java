package org.zooSimulator.builder;

import org.zooSimulator.entity.Animal;

public abstract class AnimalBuilder {

    private String nom;

    public String getNom() {
        return nom;
    }

    public AnimalBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }

    public abstract AnimalBuilder enclos(String name);

    public abstract AnimalBuilder alimenter(String name);

    public abstract AnimalBuilder activite(String activite);



    public abstract Animal build();

}
