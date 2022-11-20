package serhat.locationcontrolvenus.business.abstracts;

import serhat.locationcontrolvenus.core.utilities.results.DataResult;
import serhat.locationcontrolvenus.core.utilities.results.Result;
import serhat.locationcontrolvenus.entities.dtos.request.UserLoginRequestDTO;
import serhat.locationcontrolvenus.entities.dtos.request.UserRegisterRequestDTO;
import serhat.locationcontrolvenus.entities.dtos.response.UserListResponseDTO;
import serhat.locationcontrolvenus.entities.dtos.response.UserLoginResponseDTO;

import java.util.List;

public interface UserService {

  DataResult<List<UserListResponseDTO>> getAllUser();
  DataResult<UserLoginResponseDTO> login(UserLoginRequestDTO userLoginRequestDTO);
  Result singup(UserRegisterRequestDTO userRegisterRequestDTO);
}
