package cookebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookebook.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}