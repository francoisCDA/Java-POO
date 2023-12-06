package org.TP_JV.factory.personnage.implement;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;
import org.TP_JV.factory.personnage.entity.impl.ArcherActions;
import org.TP_JV.factory.personnage.entity.impl.ArcherSprites;
import org.TP_JV.factory.personnage.entity.impl.ArcherStats;

public class ArcherFactory extends PersonnageFactory {


    @Override
    public Sprites createSprite() {
        return new ArcherSprites();
    }

    @Override
    public Stats createStats() {
        return new ArcherStats();
    }

    @Override
    public Actions createActions() {
        return new ArcherActions();
    }
}
