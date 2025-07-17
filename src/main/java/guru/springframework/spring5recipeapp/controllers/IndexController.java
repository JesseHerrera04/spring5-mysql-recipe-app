package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 7/10/2025 by Jesse H.
 * Package: Controllers; Class: IndexController
 * MVC for Index Page
 */

@Controller
public class IndexController {

    // Show the view using Thymeleaf template, and request mapping
    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {

        System.out.println("Some message to say....12345678!!!!");
        return "index";
    } // End getIndexPage()
} // End IndexController Class
