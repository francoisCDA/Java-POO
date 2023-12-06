package org.TP_JV.royaume;

import org.TP_JV.royaume.classes.Batiment;
import org.TP_JV.royaume.classes.Personnage;

import java.util.ArrayList;

public class Royaume {

    private String nom;

    private int tresor;

    private ArrayList<Batiment> batiments ;

    private ArrayList<Personnage> personnages ;



    private Royaume(Builder builder) {
        this.nom = builder.nom;
        setTresor(builder.tresor);
        setBatiments(builder.batiments);
        setPersonnages(builder.personnages);
    }

    public static class Builder {
        private String nom;

        private int tresor;

        private ArrayList<Batiment> batiments = new ArrayList<Batiment>() ;

        private ArrayList<Personnage> personnages = new ArrayList<Personnage>();



        public Builder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public Builder tresor(int tresor){
            this.tresor = tresor;
            return this;
        }

        public Builder batiments(ArrayList<Batiment> batiments) {
            this.batiments.addAll(batiments);
            return this;
        }

        public Builder batiments(Batiment batiment) {
            this.batiments.add(batiment);
            return this;
        }

        public Builder personnages(ArrayList<Personnage> personnages){
            this.personnages.addAll(personnages);
            return this;
        }

        public Builder personnages(Personnage personnage) {
                this.personnages.add(personnage);
                return this;
        }

        public Royaume build() {
            if (nom == null) throw new RuntimeException("Nom obligatoire");
            if (personnages == null) throw new RuntimeException("un royaume doit avoir des personnages");
            return new Royaume(this);
        }


    }


    public String getNom() {
        return nom;
    }

    public ArrayList<Batiment> getBatiments() {
        return batiments;
    }

    public int getTresor() {
        return tresor;
    }

    public void setTresor(int tresor) { this.tresor = tresor; }

    public void setBatiments(ArrayList<Batiment> batiments) {
        this.batiments = batiments;
    }

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(ArrayList<Personnage> personnages) {
        this.personnages = personnages;
    }

    public void commercer(Royaume ami) {
        System.out.println("Vous commercez avec le royaume de " + ami.nom);
    }
    public void declarerLaGuerre(Royaume ennemie) {
        System.out.println("Vous avez déclarer la guerre au royaume de " + ennemie.nom);
    }

}
