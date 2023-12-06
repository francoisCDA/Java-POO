package org.TP_JV.factory.personnage;

import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;

public abstract class PersonnageFactory {

    public abstract Sprites createSprite();

    public abstract Stats createStats();

    public abstract Actions createActions();


}
