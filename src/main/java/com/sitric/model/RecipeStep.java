package com.sitric.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Шаг рецепта
 */
public class RecipeStep implements Serializable {
    private Long id;
    // сколько по времени длится данный шаг, в сек
    private Integer duration;
    private Set<Ingredient> ingredients;
    private Set<Inventory> inventorySet;

    public RecipeStep() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Inventory> getInventorySet() {
        return inventorySet;
    }

    public void setInventorySet(Set<Inventory> inventorySet) {
        this.inventorySet = inventorySet;
    }

    @Override
    public String toString() {
        return "RecipeStep{" +
                "id=" + id +
                ", duration=" + duration +
                ", ingredients=" + ingredients +
                ", inventorySet=" + inventorySet +
                '}';
    }
}
