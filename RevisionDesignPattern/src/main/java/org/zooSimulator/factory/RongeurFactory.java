package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.RongeurActivity;

public class RongeurFactory extends AnimalFactory {
    @Override
    public AnimalActivity createActivity() {
        return new RongeurActivity();
    }
}
