package cookebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cookebook.domain.Cookbook;
import cookebook.repository.CookbookRepository;

@Controller
@RequestMapping("/cookbook")
public class CookbookController {
    @Autowired
    CookbookRepository cookbookRepository;

    @GetMapping
    private ResponseEntity<Iterable<Cookbook>> getCookbooks() {
        return new ResponseEntity<>(cookbookRepository.findAll(), HttpStatus.OK);
    }
}