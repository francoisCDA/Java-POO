package org.TP_JV.factory.personnage.entity.impl;

import org.TP_JV.factory.personnage.entity.Stats;

public class MageStats extends Stats {

    @Override
    public int[] level(int[] PvForceMagie) {
        System.out.println("Mage Level Up");
        int[] ret = new int[3];
        ret[0] = PvForceMagie[0] + 5;
        ret[1] = PvForceMagie[1] + 5;
        ret[2] = PvForceMagie[2] + 30;

        return ret;
    }
}
