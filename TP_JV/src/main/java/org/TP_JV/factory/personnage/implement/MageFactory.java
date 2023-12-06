package org.TP_JV.factory.personnage.implement;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;
import org.TP_JV.factory.personnage.entity.impl.MageActions;
import org.TP_JV.factory.personnage.entity.impl.MageSprite;
import org.TP_JV.factory.personnage.entity.impl.MageStats;

public class MageFactory extends PersonnageFactory {
    @Override
    public Sprites createSprite() {
        return new MageSprite();
    }

    @Override
    public Stats createStats() {
        return new MageStats();
    }

    @Override
    public Actions createActions() {
        return new MageActions();
    }
}
