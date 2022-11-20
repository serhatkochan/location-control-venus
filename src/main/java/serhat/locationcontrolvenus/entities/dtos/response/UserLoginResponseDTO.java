package serhat.locationcontrolvenus.entities.dtos.response;

import lombok.*;

@Data
public class UserLoginResponseDTO {
  private String email;
  private String password;
  private String token;
}
