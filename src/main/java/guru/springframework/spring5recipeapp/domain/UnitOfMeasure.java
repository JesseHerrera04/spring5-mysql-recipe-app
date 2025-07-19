package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: UnitOfMeasure
 * Pojo/Entity for Unit of Measure
 */

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Long getId() {
        return id;
    } // End getId()

    public void setId(Long id) {
        this.id = id;
    } // End setId()

    public String getDescription() {
        return description;
    } // End getDescription()

    public void setDescription(String uom) {
        this.description = uom;
    } // End setDescription()
} // End UnitOfMeasure Class
