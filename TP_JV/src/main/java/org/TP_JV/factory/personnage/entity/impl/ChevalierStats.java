package org.TP_JV.factory.personnage.entity.impl;

import org.TP_JV.factory.personnage.entity.Stats;

public class ChevalierStats extends Stats {

    @Override
    public int[] level(int[] PvForceMagie) {
        System.out.println("Chevalier Level Up");
        int[] ret = new int[3];
        ret[0] = PvForceMagie[0] + 30;
        ret[1] = PvForceMagie[1] + 20;
        ret[2] = PvForceMagie[2] + 10;

        return ret;
    }
}
