package org.TP_JV.factory.batiments;

import org.TP_JV.factory.batiments.abstracs.DefenseBatiment;
import org.TP_JV.factory.batiments.abstracs.FormeBatiment;
import org.TP_JV.factory.batiments.abstracs.ProductBatiment;
import org.TP_JV.factory.batiments.abstracs.StyleBatiment;

public abstract class BatimentFactory {

    public abstract StyleBatiment createBatStyle();

    public abstract FormeBatiment createBatForme();

    public abstract DefenseBatiment createBatDefense();

    public abstract ProductBatiment createBatProduct();



}


