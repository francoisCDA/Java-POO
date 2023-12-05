package org.Exercices.Restaurant;

public class Main {

    public static void main(String[] args) {

        Restaurant restoItalien = new Restaurant(new ItalianFactory());

        Restaurant restoJaponais = new Restaurant(new JapaneseFactory());


        restoItalien.testResto();
        restoJaponais.testResto();
    }
}
