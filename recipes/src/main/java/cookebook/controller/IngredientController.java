package cookebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping('/ingredient')
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping
    public ResponseEntity<Iterable<Ingredient>> getIngredients() {
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingredient> newIngredient(@RequestBody Ingredient ingredient) {
        return new ResponseEntity<>(ingredientRepository.save(), HttpStatus.CREATED);
    }
}
