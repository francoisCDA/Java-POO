package org.TP_JV.royaume.classes;

import org.TP_JV.factory.personnage.PersonnageFactory;
import org.TP_JV.factory.personnage.entity.Actions;
import org.TP_JV.factory.personnage.entity.Sprites;
import org.TP_JV.factory.personnage.entity.Stats;

import java.util.Arrays;

public class Personnage {


    private int[] PvForceMagie = new int[3];

    private Sprites sprites;
    private Stats stats;
    private Actions actions;

    private PersonnageFactory personnageFactory;


    private void setPersonnageFactory(PersonnageFactory personnageFactory) {
        this.personnageFactory = personnageFactory;

    }

    public Personnage(Builder builder){
        PvForceMagie[0] = builder.PV;
        PvForceMagie[1] = builder.force;
        PvForceMagie[2] = builder.magie;
        setPersonnageFactory(builder.personnageFactory);
        sprites = personnageFactory.createSprite();
        stats = personnageFactory.createStats();
        actions = personnageFactory.createActions();
    }

    public static class Builder {
        private int PV;
        private int force;
        private int magie;


        private PersonnageFactory personnageFactory;

        public Builder PV(int pv) {
            this.PV = pv;
            return this;
        }

        public Builder force(int force) {
            this.force = force;
            return this;
        }

        public Builder magie(int magie) {
            this.magie = magie;
            return this;
        }

        public Builder personnageFactory(PersonnageFactory personnageFactory) {
            this.personnageFactory = personnageFactory;

            return this;
        }

        public Personnage build() {
            if (PV < 1) throw new RuntimeException("PV 1 minimum");
            return new Personnage(this);
        }
    }


    public int getPV() {
        return PvForceMagie[0];
    }

    public void setPV(int PV) {
        PvForceMagie[0] = PV;
    }

    public int getForce() {
        return PvForceMagie[1];
    }

    public void setForce(int force) {
        this.PvForceMagie[1] = force;
    }

    public int getMagie() {
        return PvForceMagie[2];
    }

    public void setMagie(int magie) {
        this.PvForceMagie[2] = magie;
    }

    public void levelUp() {
        PvForceMagie = stats.level(PvForceMagie);
    }

    public void action() {
        actions.mkMoves();
    }

    public void afficher() {
        sprites.afficher();
    }

    @Override
    public String toString() {
        return "Personnage : " +
                "PV Force Magie = " + Arrays.toString(PvForceMagie) +
                '.';
    }
}
