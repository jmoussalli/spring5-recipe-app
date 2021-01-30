package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by jerom on 17/01/2021 at 15:29
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
