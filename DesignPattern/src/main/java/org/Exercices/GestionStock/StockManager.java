package org.Exercices.GestionStock;

public class StockManager implements Observer {
    @Override
    public void update(int stock) {
        System.out.println("Manager notification : " + stock);
    }
}
