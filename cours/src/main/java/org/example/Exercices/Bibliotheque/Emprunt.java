package org.example.Exercices.Bibliotheque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Emprunt {

    private Personne personne;

    private Livre livre;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Emprunt(Personne personne, Livre livre, int jours) {
        this.personne = personne;
        this.livre = livre;
        this.dateDebut = LocalDate.now();
        this.dateFin = this.dateDebut.plusDays(jours);

      //  this.dateFin = dateFin;
    }

    public Personne getPersonne() {
        return personne;
    }

    public Livre getLivre() {
        return livre;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Emprunt : " +
                "personne = " + personne +
                ", livre = " + livre +
                ", dateDebut = " + dateDebut +
                ", dateFin = " + dateFin +
                '.';
    }
}
