package com.monirulmask.spring5recipeapp.repositories;

import com.monirulmask.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by monir on 2/28/2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
