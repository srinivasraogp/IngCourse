package com.hcl.ingit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingit.entiry.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Object findByStudentId(Long studentId);

}
