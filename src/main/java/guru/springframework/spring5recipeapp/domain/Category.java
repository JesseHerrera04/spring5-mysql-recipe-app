package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Domain; Class: Category
 * POJO/Entity for Recipe Category
 */

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    // Getters and Setters
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

    public Set<Recipe> getRecipes() {
        return recipes;
    } // End getRecipes()

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    } // End setRecipes()
} // End Category Class
