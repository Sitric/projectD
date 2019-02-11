package com.sitric.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Рецепт
 */

@Document(collection = "reciepes")
public class Recipe {

    @Id
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
