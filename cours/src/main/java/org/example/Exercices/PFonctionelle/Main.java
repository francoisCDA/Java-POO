package org.example.Exercices.PFonctionelle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produits> mesProduits = new ArrayList<>();

        mesProduits.add(new Produits("truc",12,"inclassable"));
        mesProduits.add(new Produits("truc1",10,"inclassable"));
        mesProduits.add(new Produits("truc2",120,"inclassable"));
        mesProduits.add(new Produits("truc3",20,"classable"));
        mesProduits.add(new Produits("truc4",18,"classable"));
        mesProduits.add(new Produits("truc5",100,"classable"));


        List<Produits> produitsfiltred = Util.filterProduits(mesProduits,15, (Util::prixMax));

        List<Produits> produitsfiltred2 = Util.filterProduits(mesProduits,15, ((p, max) -> { return p.getPrix() < max; } ));


        System.out.println(produitsfiltred);
        Util.soutListProduit(produitsfiltred);
        System.out.println("---");

        Util.soutListProduit(produitsfiltred2);

        List<Produits> produitsfiltred3 = Util.filterCategorie(mesProduits,"classable", ((p,cat) -> {return p.getCategorie().equals(cat);}));
        System.out.println("---");
        System.out.println(produitsfiltred3);

    }
}
