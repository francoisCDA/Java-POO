package org.Exercices.GestionStock;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Product implements Subject {

    private int stockProduct;

    List<Observer> observers;

    public Product() {
        observers = new ArrayList<>();
        stockProduct = 12;
    }

    public void changeStockProduct(int newStock){
        stockProduct = newStock;
        notifycationObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifycationObservers() {
        observers.forEach( obs -> obs.update(stockProduct));
    }
}
