package com.sitric.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Шаг рецепта
 */

@Document(collection = "reciepeSteps")
public class RecipeStep {

    @Id
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
