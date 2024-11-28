package In.NIT.Repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import In.NIT.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
