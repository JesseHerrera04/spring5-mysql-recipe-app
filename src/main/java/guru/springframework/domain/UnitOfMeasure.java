package guru.springframework.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: UnitOfMeasure
 * Pojo/Entity for Unit of Measure
 */

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

} // End UnitOfMeasure Class
