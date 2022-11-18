package com.williamk19.integrativeProg.Controllers;

import com.williamk19.integrativeProg.Bean.Student;
import com.williamk19.integrativeProg.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
  StudentRepository studentRepository;

  @CrossOrigin
  @GetMapping("/all")
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @CrossOrigin
  @PostMapping("/add")
  public Student addStudent(@RequestBody Student s) {
    return studentRepository.save(s);
  }

  @CrossOrigin
  @DeleteMapping("/delete/{id}")
  public void deleteStudent(@PathVariable int id) {
    studentRepository.deleteById(id);
  }

  @CrossOrigin
  @GetMapping("/{id}")
  public Optional<Student> getStudent(@PathVariable int id) {
    return studentRepository.findById(id);
  }
}
