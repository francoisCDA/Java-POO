package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.FauveActivity;
import org.zooSimulator.builder.AnimalBuilder;
import org.zooSimulator.entity.Animal;

public class FauveFactory extends AnimalFactory{


    @Override
    public AnimalActivity createActivity() {
        return new FauveActivity();
    }
}
