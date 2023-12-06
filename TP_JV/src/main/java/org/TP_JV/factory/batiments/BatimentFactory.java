package org.TP_JV.factory.batiments;


import org.TP_JV.factory.entity.Afficher;
import org.TP_JV.factory.entity.PrixFabrication;
import org.TP_JV.factory.entity.Production;

public abstract class BatimentFactory {

    public abstract PrixFabrication createBatiment();

    public abstract Afficher createSprite();

    public abstract Production createProduction();



}


