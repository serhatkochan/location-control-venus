package serhat.locationcontrolvenus.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serhat.locationcontrolvenus.business.abstracts.UserService;
import serhat.locationcontrolvenus.core.utilities.results.DataResult;
import serhat.locationcontrolvenus.core.utilities.results.Result;
import serhat.locationcontrolvenus.core.utilities.results.SuccessDataResult;
import serhat.locationcontrolvenus.dataAccess.abstracts.UserRepository;
import serhat.locationcontrolvenus.entities.concretes.User;
import serhat.locationcontrolvenus.entities.dtos.request.UserLoginRequestDTO;
import serhat.locationcontrolvenus.entities.dtos.request.UserRegisterRequestDTO;
import serhat.locationcontrolvenus.entities.dtos.response.UserListResponseDTO;
import serhat.locationcontrolvenus.entities.dtos.response.UserLoginResponseDTO;

import java.util.List;

@Service
public class UserManager implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public DataResult<List<UserListResponseDTO>> getAllUser() {
    return new SuccessDataResult<List<UserListResponseDTO>>(userRepository.getAllUser());
  }

  @Override
  public DataResult<UserLoginResponseDTO> login(UserLoginRequestDTO userLoginRequestDTO) {
    return null;
  }

  @Override
  public Result singup(UserRegisterRequestDTO userRegisterRequestDTO) {
    User newUser = new User();
    newUser.setEmail(userRegisterRequestDTO.getEmail());
    newUser.setPassword(userRegisterRequestDTO.getPassword1());
    userRepository.save(newUser);
    return new Result(true, "Kayıt etme işlemi yapıldı");
  }
}
