package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 8/1/2025 by Jesse H.
 * Package: Commands; Class: UnitOfMeasureCommand
 * Command Object for Unit of Measure
 */

@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
