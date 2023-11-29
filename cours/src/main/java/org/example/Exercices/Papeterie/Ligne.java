package org.example.Exercices.Papeterie;

public class Ligne {

    private String refArticle;

    private int quantite;

    private float remise;

    public Ligne( String ref, int quantite, float remise) {
        this.refArticle = ref;
        this.quantite = quantite;
        this.remise = remise;
    }

    public void AfficheLigne() {
        Article nomArticle = Article.getArticle(refArticle);
        System.out.printf("\nRef Article : %s,Libélé article : %s, tarif unitaire : %.2f, quantité : %d, prix total %.2f",refArticle,nomArticle.getPrix(),quantite,(quantite * article.getPrix*(1-remise/100)));
    }


}
