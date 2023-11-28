package org.example.Exercices.Bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> livres  = new ArrayList<Livre>() ;

    private ArrayList<Emprunt> emprunts = new ArrayList<Emprunt>() ;

    public void addLivre(Livre livre) {
        livres.add(livre);
    }

    public void deleteLivre(int id) {
        int idx = -1;
        for (int i = 0 ; i < livres.size() ; i++ ) {
            if (livres.get(i).id == id) {
                idx = id ;
            }
        }
        if (idx != -1) {
            livres.remove(idx);
        }
    }

    public Livre[] findLivresByTitre(String titre) {
        ArrayList<Livre> ret = new ArrayList<Livre>();

        for (Livre l:livres) {
            if (l.titre.equals(titre)) {
                ret.add(l);
            }
        }

        return ret.toArray(new Livre[0]);

    }

    public Livre[] findLivresByAuteur(String auteur) {
        ArrayList<Livre> ret = new ArrayList<Livre>();

        for (Livre l:livres) {
            if (l.auteur.equals(auteur)) {
                ret.add(l);
            }
        }

        return ret.toArray(new Livre[0]);

    }

    public boolean empruntLivre(Personne personne, Livre livre ) {
        return empruntLivre(personne,livre,6);
    }

    public boolean empruntLivre(Personne personne, Livre livre, int jours ) {

        if (livres.contains(livre)) {
            emprunts.add(new Emprunt(personne,livre,jours));
            livres.remove(livre);
            return true;
        }

        return false;

    }

    public boolean retourLivre(Emprunt emprunt) {

        if (emprunts.contains(emprunt)) {
            livres.add(emprunt.getLivre());
            emprunts.remove(emprunt);
            return true;
        }
        return false;

    }




}
