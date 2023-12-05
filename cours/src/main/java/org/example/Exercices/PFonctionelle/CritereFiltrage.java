package org.example.Exercices.PFonctionelle;

@FunctionalInterface
public interface CritereFiltrage {
   boolean run(Produits p, double max);
}
