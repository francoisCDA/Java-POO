package org.example.Demos;


import com.github.lalyos.jfiglet.FigletFont;
import org.example.Demos.Lombok.Person;

import java.io.IOException;


public class Figlet {

    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Hello Word");
        System.out.println(asciiArt);


        Person bado = new Person(1254);

        Person bado2 =new Person();

        bado2.setId(12334);
        bado2.setNom("Roger");

        bado.toString();

        Person person1 = new Person(1,"Jean","Robert");
        Person person2 = new Person(2,"Jean","Robert");


        System.out.println(person1.equals(person2)); // true car ne compare nom et prenom


    }

}
