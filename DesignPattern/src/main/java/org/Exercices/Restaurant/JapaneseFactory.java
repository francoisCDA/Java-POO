package org.Exercices.Restaurant;

public class JapaneseFactory extends CuisineFactory{
    @Override
    public Ingredients createIngredients() {
        return new JapaneseIngredient();
    }

    @Override
    public CoockingUtensil createCoockingUstensil() {
        return new JapaneseUtensil();
    }

    @Override
    public Dish createDish() {
        return new JapaneseDish();
    }
}
