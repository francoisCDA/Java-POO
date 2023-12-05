package org.TP_JV.factory.batiments.implement;

import org.TP_JV.factory.batiments.BatimentFactory;
import org.TP_JV.factory.batiments.abstracs.DefenseBatiment;
import org.TP_JV.factory.batiments.abstracs.FormeBatiment;
import org.TP_JV.factory.batiments.abstracs.ProductBatiment;
import org.TP_JV.factory.batiments.abstracs.StyleBatiment;


public class Ferme extends BatimentFactory {


    @Override
    public StyleBatiment createBatStyle() {
        return null;
    }

    @Override
    public FormeBatiment createBatForme() {
        return null;
    }

    @Override
    public DefenseBatiment createBatDefense() {
        return null;
    }

    @Override
    public ProductBatiment createBatProduct() {
        return null;
    }
}
