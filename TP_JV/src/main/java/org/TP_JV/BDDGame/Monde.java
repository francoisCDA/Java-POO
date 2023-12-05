package org.TP_JV.BDDGame;

import org.TP_JV.royaume.Royaume;

import java.util.HashMap;

public class Monde {

    private static volatile Monde instance = null ;

    private HashMap<String, Royaume> monde;

    public HashMap<String, Royaume> getMonde() { return monde; }

    private Monde() { monde = new HashMap<>(); }

    public static Monde getInstance() {
        if (instance == null) {
            synchronized (Monde.class) {
                instance = new Monde();
            }
        }

        return instance;
    }

}
