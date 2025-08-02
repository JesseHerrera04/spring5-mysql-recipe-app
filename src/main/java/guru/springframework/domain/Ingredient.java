package guru.springframework.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Ingredient
 * POJO/Entity for Ingredient
 */

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@ToString(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    // Many ingredients can have the same uom, fails if 1-1 in later Spring versions
    @ManyToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    // Null constructor
    public Ingredient() {
    } // End Ingredient()

    // Constructor for Ingredient (3 params)
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    } // End Ingredient()

    // Constructor for Ingredient (4 params with Recipe)
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    } // End Ingredient()

} // End Ingredient Class
