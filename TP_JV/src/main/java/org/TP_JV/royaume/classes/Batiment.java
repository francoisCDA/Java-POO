package org.TP_JV.royaume.classes;

import org.TP_JV.factory.batiments.BatimentFactory;
import org.TP_JV.factory.entity.Afficher;
import org.TP_JV.factory.entity.PrixFabrication;
import org.TP_JV.factory.entity.Production;
import org.TP_JV.royaume.classes.enums.Ressource;

import java.util.ArrayList;


public class Batiment {

    private int[] coordXY;

    private ArrayList<Ressource> stock;

    private BatimentFactory batimentFactory;

        private PrixFabrication construire;
        private Afficher spriteUrl;
        private Production production;



    private Batiment(Builder builder){
        coordXY = builder.coordXY;
        stock = new ArrayList<Ressource>;
        batimentFactory = builder.batimentFactory;
        construire = batimentFactory.createBatiment();
        spriteUrl = batimentFactory.createSprite();
        production = batimentFactory.createProduction();
    }

    public static class Builder {
        private int[] coordXY = new int[2];
        private BatimentFactory batimentFactory;

        public Builder coordX(int coordX){
            coordXY[0] = coordX ;
            return this;
        }

        public Builder coordY(int coordY){
            coordXY[1] = coordY ;
            return this;
        }

        public Builder BatimentFactory(BatimentFactory batFact) {
            batimentFactory = batFact;
            return this;
        }

        public Batiment build() {
            return new Batiment(this);
        }

    }

    public int fabrication() {
        return construire.payer();
    }



}
