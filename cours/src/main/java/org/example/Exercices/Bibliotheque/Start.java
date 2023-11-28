package org.example.Exercices.Bibliotheque;

public class Start {

    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.addLivre(new LivrePapier("Stephane Roi","Caroline",75,"Toto Edition"));
        bibliotheque.addLivre(new LivrePapier("Stephane Roi","Marche à l'ombre",82,"Toto Edition"));
        bibliotheque.addLivre(new LivrePapier("Stephane Roi","ça m'intéresse",95,"Toto Edition"));
        bibliotheque.addLivre(new LivrePapier("Stephane Roi","La tour salle",89,"Toto Edition"));
        bibliotheque.addLivre(new LivrePapier("JK Rouleau","Barry Hotter",109,"Titi Edition"));
        bibliotheque.addLivre(new LivrePapier("JK Rouleau","Barry Hotter 2",25,"Titi Edition"));


    }


}
