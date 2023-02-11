package cookebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookebook.domain.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
