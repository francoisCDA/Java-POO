package org.Exercices.Strategie;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {

    public static Scanner inputTxt = new Scanner(System.in);
    public static void main(String[] args) {

        NavigationSysteme gogoleMap = new NavigationSysteme();


        System.out.print("\n\tIndiquer une destination > ");
        String destination = inputTxt.nextLine();

        String choix = "null";

        while (!choix.equalsIgnoreCase("Q")) {
            System.out.println("\n > Choix de navigation");
            System.out.println("\t1 - Par la route");
            System.out.println("\t2 - Offroad");
            System.out.println("\t3 - Economique");
            System.out.println("\tQ - Quitter");
            choix = inputTxt.next();

            switch (choix) {
                case "1" -> gogoleMap.goTo(destination,new RoadStrategy());
                case "2" -> gogoleMap.goTo(destination,new OffRoadStrategy());
                case "3" -> gogoleMap.goTo(destination,new EconomicStrategy());
            }

        }

        System.out.println("\n Fermeture de l'application... \n\t À bientôt.");

    }
}
