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

    // Many ingredients can have the same uom, fails if 1-1 in later Spring versions
    @ManyToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    // Null constructor
    public Ingredient() {
    } // End Ingredient()

    // Constructor for Ingredient
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    } // End Ingredient()

    public Long getId() {
        return id;
    } // End getId()

    public void setId(Long id) {
        this.id = id;
    } // End setId()

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
    } // End setAmount()

    public UnitOfMeasure getUom() {
        return uom;
    } // End getUom()

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    } // End setUom()

    public Recipe getRecipe() {
        return recipe;
    } // End getRecipe()

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    } // End setRecipe()
} // End Ingredient Class
