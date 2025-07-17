package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Recipe
 * POJO/Entity for Recipes
 */

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //TODO add
    //private Difficulty difficulty

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

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

    public Integer getPrepTime() {
        return prepTime;
    } // End getPrepTime()

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    } // End setPrepTime()

    public Integer getCookTime() {
        return cookTime;
    } // End getCookTime()

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    } // End setCookTime()

    public Integer getServings() {
        return servings;
    } // End getServings()

    public void setServings(Integer servings) {
        this.servings = servings;
    } // End setServings()

    public String getSource() {
        return source;
    } // End getSource()

    public void setSource(String source) {
        this.source = source;
    } // End setSource()

    public String getUrl() {
        return url;
    } // End getUrl()

    public void setUrl(String url) {
        this.url = url;
    } // End setUrl()

    public String getDirections() {
        return directions;
    } // End getDirections()

    public void setDirections(String directions) {
        this.directions = directions;
    } // End setDirections()

    public Byte[] getImage() {
        return image;
    } // End getImage()

    public void setImage(Byte[] image) {
        this.image = image;
    } // End setImage()

    public Notes getNotes() {
        return notes;
    } // End getNotes()

    public void setNotes(Notes notes) {
        this.notes = notes;
    } // End setNotes()
} // End Recipe Class
