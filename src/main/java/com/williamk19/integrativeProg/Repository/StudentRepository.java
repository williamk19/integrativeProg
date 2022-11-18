package com.williamk19.integrativeProg.Repository;

import com.williamk19.integrativeProg.Bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
