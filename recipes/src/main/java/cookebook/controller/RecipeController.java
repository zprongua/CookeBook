package cookebook.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cookebook.domain.Recipe;
import cookebook.repository.RecipeRepository;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping
    private ResponseEntity<Iterable<Recipe>> getRecipies() {
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Recipe> newRecipe(@RequestBody Recipe recipe) {
        return new ResponseEntity<>(recipeRepository.save(recipe), HttpStatus.CREATED);
    }
}
