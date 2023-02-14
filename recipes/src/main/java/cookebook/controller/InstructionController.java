package cookebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cookebook.repository.InstructionRepository;

@Controller
@RequestMapping("/instruction")
public class InstructionController {

    @Autowired
    InstructionRepository instructionRepository;

    @GetMapping
    private ResponseEntity<Iterable<Instruction>> getInstructions() {
        return new ResponseEntity<>(instructionRepository.findAll(), HttpStatus.OK);
    }
}
