package org.TP_JV.factory.personnage.implement;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;
import org.TP_JV.factory.personnage.entity.impl.PaysanActions;
import org.TP_JV.factory.personnage.entity.impl.PaysanSprites;
import org.TP_JV.factory.personnage.entity.impl.PaysanStats;

public class PaysanFactory extends PersonnageFactory {
    @Override
    public Sprites createSprite() {
        return new PaysanSprites();
    }

    @Override
    public Stats createStats() {
        return new PaysanStats();
    }

    @Override
    public Actions createActions() {
        return new PaysanActions();
    }
}
