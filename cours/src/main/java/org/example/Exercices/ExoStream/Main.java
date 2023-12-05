package org.example.Exercices.ExoStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static HashMap<String, Integer> mots = new HashMap<>();

    public static void main(String[] args) {

        //Lire à partir d'un fichier texte
        try {
            Scanner scanner = new Scanner(new File("path/to/file"));
            StringBuilder textBuider = new StringBuilder();
            do {
                textBuider.append(scanner.nextLine());
            } while (scanner.hasNextLine());
            String allText = textBuider.toString();
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        String article = "Le langage Java reprend en grande partie la syntaxe du langage C++. Néanmoins, Java est épuré des concepts les plus subtils du C++ et à la fois les plus déroutants, tels que les pointeurs et références, ou l’héritage multiple contourné par l’implémentation des interfaces. De même, depuis la version 8, l'arrivée des interfaces fonctionnelles introduit l'héritage multiple (sans la gestion des attributs) avec ses avantages et inconvénients tels que l'héritage en diamant. Les concepteurs ont privilégié l’approche orientée objet de sorte qu’en Java, tout est objet à l’exception des types primitifs (nombres entiers, nombres à virgule flottante, etc.) qui ont cependant leurs variantes qui héritent de l'objet Object (Integer, Float, Double, etc.).";

        Stream<String> listMots = Arrays.stream(article.split("[ '\'’]"));

        listMots = listMots.map(String::toLowerCase);
        listMots = listMots.map(Main::rmPonctuation);




      //  listMots.toList().forEach(p -> System.out.print(p + "\n") );
//        listMots.forEach( m -> {
//            Integer count = mots.get(m);
//
//            if (count == null) {
//                mots.put(m,1);
//            } else {
//                mots.put(m,++count);
//            } });
//
//
//        for (Map.Entry<String,Integer> entry: mots.entrySet() )  {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

         Stream<String> motsFiltre = listMots.filter(p -> p.length() > 3);
         motsFiltre.toList().forEach( s -> System.out.println(s + " "));

    }

    private static void range(String m) {
        Integer count = mots.get(m);

        if (count == null) {
            mots.put(m,1);
        } else {
            mots.put(m,++count);
        }
    }


    public static String rmPonctuation(String mot) {
        StringBuilder retour = new StringBuilder();
        String ponctuation = ".,:/\\'\"#&_!?;()";
        for (int i = 0 ; i < mot.length() ; i++) {
            if (ponctuation.contains(String.valueOf(mot.charAt(i)))) continue;
            retour.append(mot.charAt(i));
        }
        return retour.toString();
    };

}
