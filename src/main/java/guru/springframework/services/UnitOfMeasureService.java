package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created on 8/2/2025 by Jesse H.
 * Package: Services; Class: UnitOfMeasureService
 * Interface for Unit of Measure Service
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
