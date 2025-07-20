package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 7/10/2025 by Jesse H.
 * Package: Controllers; Class: IndexController
 * MVC for Index Page
 */

@Controller
public class IndexController {

    // Repository
    private final RecipeService recipeService;

    // Constructor for DI
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    } // End IndexController()

    // Show the view using Thymeleaf template and request mapping
    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    } // End getIndexPage()
} // End IndexController Class
