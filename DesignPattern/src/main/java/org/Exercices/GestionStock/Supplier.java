package org.Exercices.GestionStock;

public class Supplier implements Observer {
    @Override
    public void update(int stock) {
        System.out.println("Supplier notification : " + stock);
    }
}
