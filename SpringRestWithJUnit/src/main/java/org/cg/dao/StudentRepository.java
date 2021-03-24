package org.cg.dao;

import org.cg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends StudentDao,JpaRepository<Student, Integer>{

}
