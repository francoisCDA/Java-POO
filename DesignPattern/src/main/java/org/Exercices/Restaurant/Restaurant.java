package org.Exercices.Restaurant;

public class Restaurant {

    private Ingredients ingredients;

    private CoockingUtensil coockingUtensil;

    private Dish dish;

    public Restaurant(CuisineFactory cuisine) {
        ingredients = cuisine.createIngredients();
        coockingUtensil = cuisine.createCoockingUstensil();
        dish = cuisine.createDish();
    }

    public void testResto() {
        ingredients.prepare();
        coockingUtensil.use();
        dish.serve();
    }

}
