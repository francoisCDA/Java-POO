package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.SerpentActivity;

public class SerpentFactory extends AnimalFactory{
    @Override
    public AnimalActivity createActivity() {
        return new SerpentActivity();
    }
}
