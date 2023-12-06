package org.TP_JV.factory.batiments.factories;

import org.TP_JV.factory.batiments.BatimentFactory;
import org.TP_JV.factory.entity.Afficher;
import org.TP_JV.factory.entity.PrixFabrication;
import org.TP_JV.factory.entity.Production;
import org.TP_JV.factory.entity.impl.ChateauAfficher;
import org.TP_JV.factory.entity.impl.ChateauPrixFabrication;
import org.TP_JV.factory.entity.impl.ChateauProduction;

public class ChateauFactory extends BatimentFactory {

    @Override
    public PrixFabrication createBatiment() {
        return new ChateauPrixFabrication();
    }

    @Override
    public Afficher createSprite() {
        return new ChateauAfficher();
    }

    @Override
    public Production createProduction() {
        return new ChateauProduction();
    }
}
