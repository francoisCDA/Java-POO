package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.entity.Animal;
import org.zooSimulator.builder.AnimalBuilder;

public abstract class AnimalFactory {

    public abstract AnimalActivity createActivity();

}
