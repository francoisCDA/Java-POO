package org.example.Exercices.Bibliotheque;

public class LivreNumerique extends Livre {

    Format format ;

    int taille ;

    public LivreNumerique(String auteur, String titre, Format format, int taille) {
        super(auteur, titre);
        this.format = format;
        this.taille = taille;
    }

    public Format getFormat() {
        return format;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return "Livre Numerique : " +
                " id=" + id +
                ", titre = " + titre +
                ", auteur = " + auteur +
                ", format = " + format +
                ", taille = " + taille +
                '.';
    }
}

