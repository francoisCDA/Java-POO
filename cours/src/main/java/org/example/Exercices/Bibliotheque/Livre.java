package org.example.Exercices.Bibliotheque;

public class Livre {

    private static int cmptLivre = 0;

    protected int id;
    protected String auteur;
    protected String titre;

    public Livre( String auteur, String titre) {
        this.id = ++cmptLivre;
        this.auteur = auteur;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Livre :" +
                " id = " + id +
                ", auteur = " + auteur +
                ", titre = " + titre +
                '.';
    }
}
