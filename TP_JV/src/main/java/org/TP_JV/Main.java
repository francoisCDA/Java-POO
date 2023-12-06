package org.TP_JV;


import org.TP_JV.BDDGame.Monde;
import org.TP_JV.factory.personnage.implement.ArcherFactory;
import org.TP_JV.factory.personnage.implement.GuerrierFactory;
import org.TP_JV.royaume.Royaume;
import org.TP_JV.royaume.classes.Personnage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Monde monde = Monde.getInstance() ;

        Personnage archer = new Personnage.Builder().PV(100).force(50).magie(15).personnageFactory(new ArcherFactory()).build();
        Personnage guerrier = new Personnage.Builder().PV(150).force(100).magie(5).personnageFactory(new GuerrierFactory()).build();
        Personnage paysan1 = new Personnage.Builder().PV(30).force(75).magie(0).personnageFactory(new GuerrierFactory()).build();
        Personnage paysan2 = new Personnage.Builder().PV(30).force(75).magie(0).personnageFactory(new GuerrierFactory()).build();
        Personnage paysan3 = new Personnage.Builder().PV(30).force(75).magie(0).personnageFactory(new GuerrierFactory()).build();

        System.out.println(archer.toString());
        archer.levelUp();
        archer.afficher();
        archer.action();




        ArrayList<Personnage> population = new ArrayList<>();
        population.add(paysan1);
        population.add(paysan2);
        population.add(paysan3);


        monde.addRoyaume(new Royaume.Builder().nom("FarFarAway").tresor(3000).personnages(population).personnages(archer).personnages(guerrier).build());
    }
}