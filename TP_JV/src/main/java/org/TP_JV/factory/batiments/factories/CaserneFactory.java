package org.TP_JV.factory.batiments.factories;

import org.TP_JV.factory.batiments.BatimentFactory;
import org.TP_JV.factory.entity.Afficher;
import org.TP_JV.factory.entity.PrixFabrication;
import org.TP_JV.factory.entity.Production;
import org.TP_JV.factory.entity.impl.CaserneAfficher;
import org.TP_JV.factory.entity.impl.CasernePrixFabrication;
import org.TP_JV.factory.entity.impl.CaserneProduction;

public class CaserneFactory extends BatimentFactory {


    @Override
    public PrixFabrication createBatiment() {
        return new CasernePrixFabrication();
    }

    @Override
    public Afficher createSprite() {
        return new CaserneAfficher();
    }

    @Override
    public Production createProduction() {
        return new CaserneProduction();
    }
}
