package cookebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookebook.domain.Instruction;

@Repository
public interface InstructionRepository extends JpaRepository<Instruction, Long> {

}
