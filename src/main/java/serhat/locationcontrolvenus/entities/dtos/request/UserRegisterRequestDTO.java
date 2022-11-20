package serhat.locationcontrolvenus.entities.dtos.request;

import lombok.Data;

@Data
public class UserRegisterRequestDTO {
  String email;
  String password1;
  String password2; // control equals password
}
