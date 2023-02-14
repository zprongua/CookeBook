package cookebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cookebook.domain.Instruction;
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
        return new ResponseEntity<>(instructionRepository.save(instruction), HttpStatus.CREATED);
    }
}
