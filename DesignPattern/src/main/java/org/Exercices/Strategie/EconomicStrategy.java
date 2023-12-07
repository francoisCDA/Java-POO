package org.Exercices.Strategie;

public class EconomicStrategy implements NavigationStrategy {
    @Override
    public String navigate(String destination) {
        return "Calcule d'itiniéraire ..... \n\t ->Lève le pouce au bord de la route, et oublis pas de sourir";
    }
}
