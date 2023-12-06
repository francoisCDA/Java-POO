package org.TP_JV.factory.batiments.factories;

import org.TP_JV.factory.batiments.BatimentFactory;
import org.TP_JV.factory.entity.Afficher;
import org.TP_JV.factory.entity.PrixFabrication;
import org.TP_JV.factory.entity.Production;
import org.TP_JV.factory.entity.impl.FermeAfficher;
import org.TP_JV.factory.entity.impl.FermePrixFabrication;
import org.TP_JV.factory.entity.impl.FermeProduction;

public class FermeFactory extends BatimentFactory {
    @Override
    public PrixFabrication createBatiment() {
        return new FermePrixFabrication();
    }

    @Override
    public Afficher createSprite() {
        return new FermeAfficher();
    }

    @Override
    public Production createProduction() {
        return new FermeProduction();
    }
}
