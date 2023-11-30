package org.example.Demos.Lombok;

import lombok.*;

@Data
public class Maison {

    private final int id; // le final sera imposé par constructeur généré par le @Data
    private String ville;
    private String adresse;
}
