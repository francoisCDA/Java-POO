package org.zooSimulator.entity;


import lombok.Data;
import org.zooSimulator.interfacesObserver.Observator;
@Data
public class Visiteur implements Observator<Animal> {

    private static int cmptBillet = 0;

    private int numeroDeBillet ;

    private int age ;

    public Visiteur(int age) {

        numeroDeBillet = ++Visiteur.cmptBillet;
        this.age = age;

    }


    @Override
    public void updateActivite(Animal animal) {
        System.out.println("Visiteur : + " + numeroDeBillet + ", age : " + age + ", getInfo : " + animal.getActivite().activite());
    }
}
