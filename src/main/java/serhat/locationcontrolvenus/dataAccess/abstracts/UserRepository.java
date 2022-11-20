package serhat.locationcontrolvenus.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import serhat.locationcontrolvenus.entities.concretes.User;
import serhat.locationcontrolvenus.entities.dtos.response.UserListResponseDTO;
import serhat.locationcontrolvenus.entities.dtos.response.UserLoginResponseDTO;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  @Query("SELECT new serhat.locationcontrolvenus.entities.dtos.response.UserListResponseDTO"
          + "(u.email, u.password)"
          + " FROM User u")
  List<UserListResponseDTO> getAllUser();
}
