package org.zooSimulator.factory;

import org.zooSimulator.activites.AnimalActivity;
import org.zooSimulator.activites.OiseauxActivity;

public class OiseauxFactory extends AnimalFactory {

    @Override
    public AnimalActivity createActivity() {
        return new OiseauxActivity();
    }
}
