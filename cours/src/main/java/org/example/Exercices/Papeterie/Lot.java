package org.example.Exercices.Papeterie;

public class Lot extends Article {

    private static int cmpt = 0;

    private String reference;

    private ArticleUnitaire produit;

    private int quantite;

    private float remise;

    private Lot( ArticleUnitaire produit, int quantite, float remise) {
        this.reference = "lot-nom-" + ++cmpt;
        this.produit = produit;
        this.quantite = quantite;
        this.remise = remise;
    }

    public Lot newLot(ArticleUnitaire produit, int quantite, float remise) {
        Lot devie = new Lot(produit,quantite,remise);
        if (Article.addArticle(devie.reference,devie)) {
            return devie;
        }
        return null;
    }

}
