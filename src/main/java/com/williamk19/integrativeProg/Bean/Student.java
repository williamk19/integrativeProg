package com.williamk19.integrativeProg.Bean;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy=GenerationType.TABLE)
  private int id;
  private String firstName;
  private String lastName;
  private String classCode;
  private String facultyCode;
  private String email;
  private LocalDate dateOfBirth;

  public Student() {
  }

  public Student(int id, String firstName, String lastName, String classCode, String facultyCode, String email, LocalDate dateOfBirth) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.classCode = classCode;
    this.facultyCode = facultyCode;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  public String getFacultyCode() {
    return facultyCode;
  }

  public void setFacultyCode(String facultyCode) {
    this.facultyCode = facultyCode;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", studyProgram='" + classCode + '\'' +
            ", faculty='" + facultyCode + '\'' +
            ", email='" + email + '\'' +
            ", dateOfBirth='" + dateOfBirth + '\'' +
            '}';
  }
}
