package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Repositories; Interface: RecipeRepository
 * Interface for Recipe Repository
 */

public interface RecipeRepository  extends CrudRepository<Recipe, Long> {
} // End RecipeRepository Interface
