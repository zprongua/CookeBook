package cookebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cookebook.domain.Ingredient;
import cookebook.repository.IngredientRepository;

@Controller
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping
    public ResponseEntity<Iterable<Ingredient>> getIngredients() {
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingredient> newIngredient(@RequestBody Ingredient ingredient) {
        return new ResponseEntity<>(ingredientRepository.save(ingredient), HttpStatus.CREATED);
    }
}
