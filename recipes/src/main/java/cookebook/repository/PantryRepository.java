package cookebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookebook.domain.Pantry;

@Repository
public interface PantryRepository extends JpaRepository<Pantry, Long> {

}
