package org.Exercices.Strategie;

public class RoadStrategy implements NavigationStrategy {

    @Override
    public String navigate(String destination) {
        return "\nCalcule d'itiniéraire vers " + destination + " ..... \n\t -> Toujours tout droit jusqu'au pont, puis 2 fois à gauche, dernière à droite";
    }
}
