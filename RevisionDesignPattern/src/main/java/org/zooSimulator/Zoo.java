package org.zooSimulator;

import org.zooSimulator.entity.Animal;
import org.zooSimulator.entity.Visiteur;
import org.zooSimulator.interfacesObserver.Observator;
import org.zooSimulator.interfacesObserver.Subject;

import java.util.ArrayList;
import java.util.List;

public class Zoo  {

    private static volatile Zoo instance = null;

    private ArrayList<Animal> animaux ;

    private ArrayList<Visiteur> visiteurs ;

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public List<Visiteur> getVisiteurs() {
        return visiteurs;
    }

    public void addAnimal(Animal animal) {
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
        animaux.forEach(Animal::getActivite);
    }


}
