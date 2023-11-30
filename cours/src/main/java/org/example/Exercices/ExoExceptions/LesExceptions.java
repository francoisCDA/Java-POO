package org.example.Exercices.ExoExceptions;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class LesExceptions {

    static Scanner scan = new Scanner(System.in) ;

    public static Integer MonParseInt(String chaine) {

        try {
            return parseInt(chaine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String IdxTable(String[] table, int idx) throws Exception {

        if (idx < 0 || idx >= table.length) throw new Exception("index invalide");

        return table[idx];

    }


    public static void main(String[] args) {

        String saisie ;
        Integer nombre;


        System.out.println("Saisissez un nombre");
        saisie = scan.next() ;

        nombre = MonParseInt(saisie);

        System.out.println("mon nombre est : "+ nombre);


        System.out.println("\n\t************\n");


        String[] tableau = {"A","B","C","D","E"};

        try {
            System.out.println(IdxTable("Valeur du tableau : " + tableau,2));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

        try {
            System.out.println(IdxTable(tableau,15));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }


    }






}
