package serhat.locationcontrolvenus.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serhat.locationcontrolvenus.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
