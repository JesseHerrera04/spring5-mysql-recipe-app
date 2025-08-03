package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created on 8/2/2025 by Jesse H.
 * Package: Services; Interface: IngredientService
 * Interface for Ingredient Service
 */

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long ingredientId);
} // End IngredientService Interface
