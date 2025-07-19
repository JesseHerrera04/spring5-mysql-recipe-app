package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Repositories; Interface: UnitOfMeasureRepository
 * Interface for Unit of Measure Repository
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
} // End UnitOfMeasureRepository Interface
