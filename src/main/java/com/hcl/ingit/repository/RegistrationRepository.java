package com.hcl.ingit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingit.entiry.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long>{

	Object findByStudentId(Long studentId);

}
