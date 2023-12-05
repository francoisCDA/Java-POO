package org.Exercices.Restaurant;

public class MexicanFactory extends CuisineFactory{
    @Override
    Ingredients createIngredients() {
        return new MexicanIngredient();
    }

    @Override
    CoockingUtensil createCoockingUstensil() {
        return new MexicanUtensil();
    }

    @Override
    Dish createDish() {
        return new MexicanDish();
    }
}
