package org.Exercices.GestionStock;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifycationObservers();
}
