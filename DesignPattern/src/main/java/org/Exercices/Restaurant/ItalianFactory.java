package org.Exercices.Restaurant;

public class ItalianFactory extends CuisineFactory{
    @Override
    Ingredients createIngredients() {
        return new ItalianIngredient();
    }

    @Override
    CoockingUtensil createCoockingUstensil() {
        return new ItalianUtensil();
    }

    @Override
    Dish createDish() {
        return new ItalianDish();
    }
}
