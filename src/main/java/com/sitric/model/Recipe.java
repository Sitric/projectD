package com.sitric.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Рецепт
 */
public class Recipe implements Serializable {
    private Long id;
    private Set<RecipeStep> recipeSteps;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<RecipeStep> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(Set<RecipeStep> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeSteps=" + recipeSteps +
                '}';
    }
}
