package org.TP_JV.factory.personnage.implement;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;
import org.TP_JV.factory.personnage.entity.impl.ChevalierActions;
import org.TP_JV.factory.personnage.entity.impl.ChevalierSprites;
import org.TP_JV.factory.personnage.entity.impl.ChevalierStats;

public class ChevalierFactory extends PersonnageFactory {
    @Override
    public Sprites createSprite() {
        return new ChevalierSprites();
    }

    @Override
    public Stats createStats() {
        return new ChevalierStats();
    }

    @Override
    public Actions createActions() {
        return new ChevalierActions();
    }
}
