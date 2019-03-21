package com.monirulmask.spring5recipeapp.services;

import com.monirulmask.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by monir on 3/1/2019.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(long l);
}
