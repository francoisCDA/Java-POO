package org.example.Exercices.ExoExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;



public class LesExeptions2 {

    private static Scanner scan = new Scanner(System.in);


    private static int soldeDuComptePourExo4 = 200;

    public static void main(String[] args) {

        exo1();

        for (int i = 0 ; i < 6 ; i ++ ) {

            try {
                exo4(50);
                System.out.println(soldeDuComptePourExo4);
            } catch (SoldeInsuffisantException banqueroute) {
                System.out.println(banqueroute.getMessage());
            }
        }


    }

    private static void exo4(int retrait) throws SoldeInsuffisantException {

        if (retrait >= soldeDuComptePourExo4 ) {throw new SoldeInsuffisantException();}

        soldeDuComptePourExo4 -= retrait;

    }


    public static void exo1() {

        int numerateur,denominateur;
        float resulat;

        try {
            System.out.println("saisissez un nombre");
            numerateur = scan.nextInt();
            System.out.println("saisissez un nombre");
            denominateur = scan.nextInt();

            resulat = numerateur / denominateur ;

            System.out.printf(" %d / %d = %f",numerateur,denominateur,resulat);

        }
        catch (InputMismatchException erreur) {
            System.out.println("saisie improbable " + erreur.getMessage());
        }
        catch (ArithmeticException probleme) {
            System.out.println("calcul insensé " + probleme.getMessage());
        }
    }




}
