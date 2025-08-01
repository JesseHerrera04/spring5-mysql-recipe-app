package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.RecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Services; Interface: RecipeService
 * Interface for Recipe Service
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
} // End RecipeService Interface
