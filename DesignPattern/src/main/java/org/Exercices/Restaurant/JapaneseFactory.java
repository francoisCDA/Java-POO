package org.Exercices.Restaurant;

public class JapaneseFactory extends CuisineFactory{
    @Override
    Ingredients createIngredients() {
        return new JapaneseIngredient();
    }

    @Override
    CoockingUtensil createCoockingUstensil() {
        return new JapaneseUtensil();
    }

    @Override
    Dish createDish() {
        return new JapaneseDish();
    }
}
