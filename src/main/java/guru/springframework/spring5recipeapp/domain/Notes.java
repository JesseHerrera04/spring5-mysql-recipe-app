package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Notes
 * POJO/Entity for Notes
 */

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    // Getters and Setters
    public Long getId() {
        return id;
    } // End getId()

    public void setId(Long id) {
        this.id = id;
    } // End setId()

    public Recipe getRecipe() {
        return recipe;
    } // End getRecipe()

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    } // End setRecipe()

    public String getRecipeNotes() {
        return recipeNotes;
    } // End getRecipeNotes()

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    } // End setRecipeNotes()
} // End Notes Class
