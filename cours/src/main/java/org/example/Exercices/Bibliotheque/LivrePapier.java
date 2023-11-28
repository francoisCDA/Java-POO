package org.example.Exercices.Bibliotheque;

public class LivrePapier extends Livre {

    private int nbPages ;
    private String editeur ;

    public LivrePapier(String auteur, String titre, int nbPages, String editeur) {
        super(auteur, titre);
        this.nbPages = nbPages;
        this.editeur = editeur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String toString() {
        return "LivrePapier : " +
                " id = " + id +
                ", titre = " + titre +
                ", auteur = " + auteur +
                ", editeur = " + editeur +
                ", nbPages = " + nbPages +
                '.';
    }
}
