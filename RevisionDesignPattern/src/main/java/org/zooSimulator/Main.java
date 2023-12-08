package org.zooSimulator;

import org.zooSimulator.entity.*;
import org.zooSimulator.factory.FauveFactory;

public class Main {
    public static void main(String[] args) {


        Zoo.getInstance().addAnimal(new Fauve("Jojo"));
        Zoo.getInstance().addAnimal(new Herbivore("Hubert"));
        Zoo.getInstance().addAnimal(new Rongeur("Steeve"));
        Zoo.getInstance().addAnimal(new Serpent("Bill"));
        Zoo.getInstance().addAnimal(new Oiseau("Chouette"));


        Zoo.getInstance().addVisiteur(new Visiteur(18));
        Zoo.getInstance().addVisiteur(new Visiteur(12));
        Zoo.getInstance().addVisiteur(new Visiteur(13));
        Zoo.getInstance().addVisiteur(new Visiteur(55));
        Zoo.getInstance().addVisiteur(new Visiteur(34));
        Zoo.getInstance().addVisiteur(new Visiteur(6));
        Zoo.getInstance().addVisiteur(new Visiteur(28));



        //Zoo.getInstance().testActivity();

        Zoo.getInstance().animalssVisitorsNotification();



    }
}
