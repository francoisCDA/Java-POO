package org.TP_JV.factory.personnage.entity.impl;

import org.TP_JV.factory.personnage.entity.Stats;

public class PaysanStats extends Stats {


    @Override
    public int[] level(int[] PvForceMagie) {
        System.out.println("augmente production");
        int[] ret = new int[3];
        ret[0] = PvForceMagie[0] + 5;
        ret[1] = PvForceMagie[1] +15;

        return ret;
    }
}
