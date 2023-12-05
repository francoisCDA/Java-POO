package org.Exercices.pizza;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pizza {

    private TaillePizza taille;
    private TypePizza type;

    private FromagePizza fromage;

    private Set<GarniturePizza> garniture;
    private SaucePizza sauce;

    private Pizza(Builder build) {
        setTaille(build.taille);
        setType(build.type);
        setFromage(build.fromage);
        setSauce(build.sauce);
        this.garniture = build.garniture;
    }

    private void setTaille(TaillePizza taille) {
        if (taille == null ){
            taille = TaillePizza.MOYENNE;
        }
        this.taille = taille;
    }

    private void setType(TypePizza type) {
        if (type == null ) {
            type = TypePizza.CLASSIQUE;
        }
        this.type = type;
    }

    private void setFromage(FromagePizza fromage) {
        if (fromage == null ) {
            fromage = FromagePizza.SANS_FROMAGE;
        }
        this.fromage = fromage;
    }

    private void setSauce(SaucePizza sauce) {
        if (sauce == null){
            sauce = SaucePizza.TOMATE;
        }
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza : " +
                taille +
                ", " + type +
                ", " + fromage +
                ", " + garniture +
                ", " + sauce +
                '.';
    }

    public static class Builder {
        private TaillePizza taille;
        private TypePizza type;
        private FromagePizza fromage;
        private SaucePizza sauce;
        private Set<GarniturePizza> garniture = new TreeSet<>();


        public Builder taille(TaillePizza taille) {
            this.taille = taille;
            return this;
        }

        public Builder type(TypePizza type) {
            this.type = type;
            return this;
        }

        public Builder fromage(FromagePizza fromage) {
            this.fromage = fromage;
            return this;
        }

        public Builder sauce(SaucePizza sauce) {
            this.sauce = sauce ;
            return this;
        }

        public Builder garniture(GarniturePizza garniture) {
            if ((garniture == GarniturePizza.ANCHOIX) && this.garniture.contains(GarniturePizza.VIANDE_HACHEE)) {
                    return this;
            }
            if ((garniture == GarniturePizza.VIANDE_HACHEE) && this.garniture.contains(GarniturePizza.ANCHOIX)) {
                return this;
            }
            this.garniture.add(garniture);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }



}
