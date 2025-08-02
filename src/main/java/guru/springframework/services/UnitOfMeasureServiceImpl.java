package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.converters.UnitOfMeasureToUnitOfMeasureCommand;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created on 8/2/2025 by Jesse H.
 * Package: Services; Class: UnitOfMeasureServiceImpl
 * Implementation for UnitOfMeasureService
 */

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository uomRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand uomToUomCommand;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository uomRepository, UnitOfMeasureToUnitOfMeasureCommand uomToUomCommand) {
        this.uomRepository = uomRepository;
        this.uomToUomCommand = uomToUomCommand;
    }

    @Override
    public Set<UnitOfMeasureCommand> listAllUoms() {
        return StreamSupport.stream(uomRepository.findAll()
                        .spliterator(), false)
                .map(uomToUomCommand::convert)
                .collect(Collectors.toSet());
    }
}
