package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Repositories; Interface: CategoryRepository
 * Interface for Category Repository
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
} // End CategoryRepository Interface
