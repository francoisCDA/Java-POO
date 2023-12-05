package org.TP_JV.royaume;

import org.TP_JV.royaume.classes.Batiment;
import org.TP_JV.royaume.classes.Personnage;

import java.util.ArrayList;

public class Royaume {

    private String nom;

    private int tresor;

    private ArrayList<Batiment> batiments = new ArrayList<Batiment>() ;

    private ArrayList<Personnage> personnages = new ArrayList<Personnage>();


    private Royaume(int tresor ,ArrayList<Batiment> batiments, ArrayList<Personnage> personnages) {
        setTresor(tresor);
        setBatiments(batiments);
        setPersonnages(personnages);
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

    public void setTresor(int tresor) {
        this.tresor = tresor;
    }

    public void setBatiments(ArrayList<Batiment> batiments) {
        this.batiments = batiments;
    }

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(ArrayList<Personnage> personnages) {
        if (personnages == null) throw new RuntimeException("un royaume doit avoir des personnages");
        this.personnages = personnages;
    }

    public void declarerLaGuerre(Royaume ennemie) {
        System.out.println("Vous avez déclarer la guerre au royaume de " + ennemie.nom);
    }

}
