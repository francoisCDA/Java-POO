package org.Exercices.Restaurant;

public class ItalianFactory extends CuisineFactory{
    @Override
    public Ingredients createIngredients() {
        return new ItalianIngredient();
    }

    @Override
    public CoockingUtensil createCoockingUstensil() {
        return new ItalianUtensil();
    }

    @Override
    public Dish createDish() {
        return new ItalianDish();
    }
}
