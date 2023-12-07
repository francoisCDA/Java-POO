package org.Exercices.Strategie;

public class OffRoadStrategy implements NavigationStrategy{
    @Override
    public String navigate(String destination) {
        return "\nCalcule d'itiniéraire ..... \n\t ->Traverse le fleuve à la nage, c'est juste après le champ";
    }
}
