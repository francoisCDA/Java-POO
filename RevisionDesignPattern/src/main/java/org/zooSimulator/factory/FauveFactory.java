package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.FauveActivity;

public class FauveFactory extends AnimalFactory{


    @Override
    public AnimalActivity createActivity() {
        return new FauveActivity();
    }
}
