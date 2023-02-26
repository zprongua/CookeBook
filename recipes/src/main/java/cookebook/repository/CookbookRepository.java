package cookebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cookebook.domain.Cookbook;

@Repository
public interface CookbookRepository extends JpaRepository<Cookbook, Long> {

}