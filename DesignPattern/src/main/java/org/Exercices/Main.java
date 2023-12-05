package org.Exercices;


import org.Exercices.pizza.*;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new  Pizza.Builder()
                .fromage(FromagePizza.MOZZARELLA)
                .taille(TaillePizza.GRANDE)
                .type(TypePizza.CLASSIQUE)
                .sauce(SaucePizza.TOMATE)
                .garniture(GarniturePizza.CHAMPIGNONS)
                .garniture(GarniturePizza.ANCHOIX)
                .garniture(GarniturePizza.POIVRONS)
                .garniture(GarniturePizza.VIANDE_HACHEE)
                .garniture(GarniturePizza.CHEVRE)
                .build();

        System.out.println(pizza1);

    }
}