package serhat.locationcontrolvenus.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serhat.locationcontrolvenus.business.abstracts.UserService;
import serhat.locationcontrolvenus.entities.dtos.request.UserLoginRequestDTO;
import serhat.locationcontrolvenus.entities.dtos.request.UserRegisterRequestDTO;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/getAll")
  public ResponseEntity<?> getAllUser() {
    return ResponseEntity.ok(userService.getAllUser());
  }

  @PostMapping(value = "/login")
  public void login(@RequestBody UserLoginRequestDTO userLoginRequestDTO) {

  }

  @PostMapping(value = "/signup")
  public ResponseEntity<?> singup(@RequestBody UserRegisterRequestDTO userRegisterRequestDTO) {
    return ResponseEntity.ok(userService.singup(userRegisterRequestDTO));
  }

  @PostMapping(value = "/forgot-password")
  public void forgotPassword() { // send mail, Princibal princibal

  }

  @PostMapping(value = "/set-user-password")
  public void setUserPassword() { // set password

  }

}
