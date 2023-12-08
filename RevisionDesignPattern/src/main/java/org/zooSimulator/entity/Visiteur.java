package org.zooSimulator.entity;

import lombok.Builder;
import lombok.Data;
import org.zooSimulator.Zoo;
import org.zooSimulator.builder.VisiteurBuilder;
import org.zooSimulator.entity.Animal;
import org.zooSimulator.interfacesObserver.Observator;
@Data
public class Visiteur implements Observator<Animal> {

    private static int cmptBillet = 0;

    private int numeroDeBillet ;

    private int age ;

    public Visiteur(int age) {

        numeroDeBillet = ++cmptBillet;
        this.age = age;

    }


    @Override
    public void updateActivite(Animal animal) {
        System.out.println(animal.getActivite());
    }
}
