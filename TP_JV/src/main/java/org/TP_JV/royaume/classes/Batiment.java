package org.TP_JV.royaume.classes;

import org.TP_JV.factory.batiments.abstracs.DefenseBatiment;
import org.TP_JV.factory.batiments.abstracs.FormeBatiment;
import org.TP_JV.factory.batiments.abstracs.ProductBatiment;
import org.TP_JV.factory.batiments.abstracs.StyleBatiment;
import org.TP_JV.royaume.classes.enums.Ressource;

import java.util.ArrayList;

public class Batiment {

    private int positionX;
    private int positionY;

    private int sizeX;
    private int sixeY;

    private String spriteUrl;
    private ArrayList<Personnage> habitants;

    private int prixFabrication;
    private Ressource[] production;


    private FormeBatiment buildBat;
    private DefenseBatiment defense;
    private StyleBatiment style;
    private ProductBatiment farm;




}
