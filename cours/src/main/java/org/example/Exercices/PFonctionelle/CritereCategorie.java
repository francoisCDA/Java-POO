package org.example.Exercices.PFonctionelle;

@FunctionalInterface
public interface CritereCategorie {
    boolean run(Produits p, String cat);
}
