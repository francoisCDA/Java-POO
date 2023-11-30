package org.example.Exercices.ExoExceptions;

public class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException(){
        super("Solde insuffisant, veuillez provisionner votre compte");
    }

}
