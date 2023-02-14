package cookebook.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cookebook.domain.Pantry;
import cookebook.repository.PantryRepository;

@Controller
@RequestMapping("/pantry")
public class PantryController {

    @Autowired
    PantryRepository pantryRepository;

    @GetMapping
    private ResponseEntity<Iterable<Pantry>> getPantries() {
        return new ResponseEntity<>(pantryRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Pantry> newPantry(@RequestBody Pantry pantry) {
        return new ResponseEntity<>(pantryRepository.save(pantry), HttpStatus.CREATED);
    }
}
