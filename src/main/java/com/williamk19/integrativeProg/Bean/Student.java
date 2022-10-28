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
  private String studyProgram;
  private String faculty;
  private String email;
  private LocalDate dateOfBirth;

  public Student() {
  }

  public Student(int id, String firstName, String lastName, String studyProgram, String faculty, String email, LocalDate dateOfBirth) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.studyProgram = studyProgram;
    this.faculty = faculty;
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

  public String getStudyProgram() {
    return studyProgram;
  }

  public void setStudyProgram(String studyProgram) {
    this.studyProgram = studyProgram;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
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
            ", studyProgram='" + studyProgram + '\'' +
            ", faculty='" + faculty + '\'' +
            ", email='" + email + '\'' +
            ", dateOfBirth='" + dateOfBirth + '\'' +
            '}';
  }
}
