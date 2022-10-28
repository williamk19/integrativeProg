package com.williamk19.integrativeProg.Repository;

import com.williamk19.integrativeProg.Bean.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
