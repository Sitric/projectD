package com.sitric.model;


import com.sitric.enums.DessertType;

/**
 * Десерты
 */
public class Dessert extends Item{
    private DessertType dessertType;
    private Recipe recipe;

    public Dessert() {
    }

    public DessertType getDessertType() {
        return dessertType;
    }

    public void setDessertType(DessertType dessertType) {
        this.dessertType = dessertType;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "dessertType=" + dessertType +
                ", recipe=" + recipe +
                '}';
    }
}
