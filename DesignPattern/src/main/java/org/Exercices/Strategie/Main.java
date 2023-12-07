package org.Exercices.Strategie;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {

    public static Scanner inputTxt = new Scanner(System.in);
    public static void main(String[] args) {

        NavigationSysteme gogoleMap = new NavigationSysteme();


        System.out.println("Indiquer une destination");
        String destination = inputTxt.nextLine();

        String choix = "null";

        while (!choix.equals("Q")) {
            System.out.println("Choix de navigation");
            System.out.println("1 - Par la route");
            System.out.println("2 - Offroad");
            System.out.println("3 - Economique");
            System.out.println("Q - Quitter");
            choix = inputTxt.next();

            switch (choix) {
                case "1" -> gogoleMap.goTo(destination,new RoadStrategy());
                case "2" -> gogoleMap.goTo(destination,new OffRoadStrategy());
                case "3" -> gogoleMap.goTo(destination,new EconomicStrategy());

            }

        }

    }
}
