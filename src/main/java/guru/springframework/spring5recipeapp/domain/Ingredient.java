package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Ingredient
 * POJO/Entity for Ingredient
 */

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    //TODO add
    //private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Long getId() {
        return id;
    } // End getId()

    public void setId(Long id) {
        this.id = id;
    } // End setId

    public String getDescription() {
        return description;
    } // End getDescription()

    public void setDescription(String description) {
        this.description = description;
    } // End setDescription()

    public BigDecimal getAmount() {
        return amount;
    } // End getAmount()

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    } // End setAmount

    public Recipe getRecipe() {
        return recipe;
    } // End getRecipe()

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    } // End setRecipe()
} // End Ingredient Class
