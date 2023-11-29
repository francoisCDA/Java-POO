package org.example.Exercices.Papeterie;

public class Stylo extends ArticleUnitaire {

    private static int cmpt = 0;

    private String reference;

    private String couleur ;

    private Stylo(String nom, double prix, String couleur) {
        super(nom, prix);
        this.reference = "Sti-" + ++cmpt;
        this.couleur = couleur;
        Article.newProduit(nom,prix);
    }

    public Stylo(ArticleUnitaire AU, String couleur) {
        super(AU.nom, AU.prx);
        this.reference = "Sti-" + ++cmpt;
        this.couleur = couleur;
    }

    public static Stylo newStylo(String nom, double prix, String couleur ) {

        Stylo bic = new Stylo(nom, prix, couleur);
        if (Article.addArticle(bic.reference,bic) ) {
            return bic ;
        } else {
            return null ;
        }
    }

    public static Stylo newStylo(ArticleUnitaire AU, String couleur) {
        return new Stylo( AU, couleur);
    }


    @Override
    public String toString() {
        return "Stylo :" +
                " ref = " + reference +
                ", nom= '" + nom + '\'' +
                ", prix = " + prx +
                ", couleur = '" + couleur + '\'' +
                '.';
    }


}
