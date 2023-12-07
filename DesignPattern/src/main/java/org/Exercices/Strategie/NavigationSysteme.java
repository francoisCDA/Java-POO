package org.Exercices.Strategie;

import lombok.Data;

@Data
public class NavigationSysteme {

    private String destination;
    private NavigationStrategy strategy;

    public void goTo(String destination,NavigationStrategy strategy) {
        this.destination = destination;
        this.strategy = strategy;
        System.out.println(strategy.navigate(this.destination));
    }



}
