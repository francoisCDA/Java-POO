package org.example.Exercices.Papeterie;

public class Ramette extends ArticleUnitaire {

    private static int cmpt = 0 ;

    private String reference;

    private int grammage;

    private Ramette(String nom, double prix, int grammage) {
        super(nom, prix);
        this.reference = "Ram-" + ++cmpt;
        this.grammage = grammage ;
    }

    public static Ramette newRamette(String nom, double prix, int grammage) {
        Ramette metro = new Ramette(nom, prix, grammage);
        if (Article.addArticle(metro.reference,metro)) {
            return metro ;
        } else {
            return null ;
        }

    }


    @Override
    public String toString() {
        return "Ramette :" +
                " numref = " + reference +
                ", nom = '" + nom + '\'' +
                ", prix = " + prx +
                " grammage = " + grammage +
                '.';
    }
}
