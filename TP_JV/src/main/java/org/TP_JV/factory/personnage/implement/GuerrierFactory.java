package org.TP_JV.factory.personnage.implement;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;
import org.TP_JV.factory.personnage.entity.impl.GuerrierActions;
import org.TP_JV.factory.personnage.entity.impl.GuerrierSprites;
import org.TP_JV.factory.personnage.entity.impl.GuerrierStats;

public class GuerrierFactory extends PersonnageFactory {
    @Override
    public Sprites createSprite() {
        return new GuerrierSprites();
    }

    @Override
    public Stats createStats() {
        return new GuerrierStats();
    }

    @Override
    public Actions createActions() {
        return new GuerrierActions();
    }
}
