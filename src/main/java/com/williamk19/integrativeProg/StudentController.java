package com.williamk19.integrativeProg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins="*")
@RequestMapping(path="/student")
public class StudentController {
  @Autowired
  StudentRepository studentRepository;

  @CrossOrigin(origins="*")
  @GetMapping(path="/all")
  public @ResponseBody Iterable<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}
