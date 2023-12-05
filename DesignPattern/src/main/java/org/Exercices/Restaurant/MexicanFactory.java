package org.Exercices.Restaurant;

public class MexicanFactory extends CuisineFactory{
    @Override
    public Ingredients createIngredients() {
        return new MexicanIngredient();
    }

    @Override
    public CoockingUtensil createCoockingUstensil() {
        return new MexicanUtensil();
    }

    @Override
    public Dish createDish() {
        return new MexicanDish();
    }
}
