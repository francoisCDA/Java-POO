package org.zooSimulator;

import org.zooSimulator.entity.Animal;
import org.zooSimulator.entity.Visiteur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo  {

    private static volatile Zoo instance = null;

    private ArrayList<Animal> animaux ;

    private ArrayList<Visiteur> visiteurs ;


    public void addAnimal(Animal animal) {
        visiteurs.forEach(animal::registerObservator);
        animaux.add(animal);
    }

    public void rmAnimal(Animal animal) {
        animaux.remove(animal);
    }


    public void addVisiteur(Visiteur visiteur) {

        animaux.forEach(a -> a.registerObservator(visiteur));
        visiteurs.add(visiteur);
    }

    public void removeVisiteur(Visiteur visiteur) {
        animaux.forEach(a -> a.removeObservator(visiteur));
        visiteurs.remove(visiteur);
    }

    private Zoo() {
        animaux = new ArrayList<>();
        visiteurs = new ArrayList<>();
    }

    public static Zoo getInstance() {
        if ( instance == null ) {
            synchronized (Zoo.class) {
                instance = new Zoo();
            }
        }
        return instance;
    }


    public void testActivity(){
        animaux.forEach(a -> a.getActivite().activite());
    }

    public void animalssVisitorsNotification() {
        animaux.forEach( a -> a.notifyObservators(a));
    }

    public Visiteur randomVisitor() {
        Random rand = new Random();
        int idx = rand.nextInt(1,visiteurs.size())-1;
        return visiteurs.get(idx);

    }

    public void rmRandomAnimal() {
        Random rand = new Random();
        int idx = rand.nextInt(1,animaux.size())-1;
        rmAnimal(animaux.get(idx));
    }

}
