package org.example.Exercices.PFonctionelle;

import java.util.ArrayList;
import java.util.List;

public class Util {


    public static boolean prixMax(Produits p , double max) {
        return max < p.getPrix();
    }


    public static List<Produits> filterProduits(List<Produits> catalogue, double max, CritereFiltrage filter) {
        List<Produits> ret = new ArrayList<>();
        for (Produits p:catalogue) {
            if (filter.run(p,max)) {
                ret.add(p);
            }
        }
        return ret;
    }

    public static List<Produits> filterCategorie(List<Produits> catalogue, String cat, CritereCategorie filter) {
        List<Produits> ret = new ArrayList<>();
        for (Produits p:catalogue) {
            if (filter.run(p,cat)) {
                ret.add(p);
            }
        }
        return ret ;
    }

    public static List<Produits> filtrer(List<Produits> catalogue, FiltreGenerique filtre) {
        List<Produits> ret = new ArrayList<>();
        for (Produits p:catalogue) {
            if (filtre.run(p)) {
                ret.add(p);
            }
        }
        return ret;
    }


    public static void soutListProduit(List<Produits> list){
        System.out.println("\n");
        for (Produits p:list) {
            System.out.print(p + " ");
        }
        System.out.println("\n");
    }

}
