package com.williamk19.integrativeProg.Controllers;

import com.williamk19.integrativeProg.Bean.User;
import com.williamk19.integrativeProg.Repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Vector;

@RestController
@RequestMapping("/user")
public class UserController {
  private UserRepository userRepository = new UserRepository();

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseEntity <String> addUser(@RequestBody User user) {
    userRepository.createUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @GetMapping("/test")
  public ResponseEntity <String> test() {
    return new ResponseEntity("Hello", HttpStatus.OK);
  }

  @GetMapping("/get")
  public ResponseEntity <Vector<User>> getAllUser() {
    return new ResponseEntity<Vector<User>>(UserRepository.getAllUsersData(), HttpStatus.OK);
  }
}
