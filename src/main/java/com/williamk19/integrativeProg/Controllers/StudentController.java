package com.williamk19.integrativeProg.Controllers;

import com.williamk19.integrativeProg.Bean.Student;
import com.williamk19.integrativeProg.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
  StudentRepository studentRepository;

  @CrossOrigin
  @GetMapping("/all")
  public @ResponseBody Iterable<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @CrossOrigin
  @PostMapping("/add")
  public @ResponseBody Student addStudent(@RequestBody Student s) {
    return studentRepository.save(s);
  }

  @CrossOrigin
  @GetMapping("/test")
  public ResponseEntity<String> test() {
    return new ResponseEntity("Hello", HttpStatus.OK);
  }
}
