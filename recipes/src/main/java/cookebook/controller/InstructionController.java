package cookebook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping
    private ResponseEntity<Instruction> newInstruction(@RequestBody Instruction instruction) {
        return new ResponseEntity<>(instructionRepository.save(instruction, HttpStatus.CREATED));
    }
}
