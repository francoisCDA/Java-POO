package org.TP_JV.factory.entity.impl;

import org.TP_JV.factory.entity.Production;
import org.TP_JV.royaume.classes.enums.Ressource;

public class ChateauProduction extends Production {

    @Override
    public Ressource[] fabrique() {
        return new Ressource[]{Ressource.OR,Ressource.OR,Ressource.OR,Ressource.OR};
    }
}
