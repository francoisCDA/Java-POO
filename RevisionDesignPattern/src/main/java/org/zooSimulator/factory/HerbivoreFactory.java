package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.HerbivoreActivity;

public class HerbivoreFactory extends AnimalFactory{
    @Override
    public AnimalActivity createActivity() {
        return new HerbivoreActivity();
    }
}
