package serhat.locationcontrolvenus.entities.dtos.request;

import lombok.Data;

@Data
public class UserLoginRequestDTO {
  String email;
  String password;
}
