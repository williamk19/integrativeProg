package com.williamk19.integrativeProg.Controllers;

import com.williamk19.integrativeProg.Bean.User;
import com.williamk19.integrativeProg.Repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Vector;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
  private UserRepository userRepository = new UserRepository();


  @CrossOrigin
  @GetMapping("/getAllUser")
  public ResponseEntity <Vector<User>> getAllUser() {
    return new ResponseEntity<Vector<User>>(UserRepository.getAllUsersData(), HttpStatus.OK);
  }

  @CrossOrigin
  @GetMapping("/getUser/{username}")
  public ResponseEntity<User> getUser(@PathVariable("username") String username) {
    return new ResponseEntity<User>(UserRepository.getUserData(username), HttpStatus.OK);
  }

  @CrossOrigin
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseEntity <String> addUser(@RequestBody User user) {
    userRepository.createUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @CrossOrigin
  @GetMapping("/delete/{username}")
  public ResponseEntity<Integer> deleteUser(@PathVariable("username") String username) {
    return new ResponseEntity<Integer>(UserRepository.deleteUser(username), HttpStatus.OK);
  }

  @CrossOrigin
  @GetMapping("/test")
  public ResponseEntity <String> test() {
    return new ResponseEntity("Hello", HttpStatus.OK);
  }
}
