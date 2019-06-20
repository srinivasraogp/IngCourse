package com.hcl.ingit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingit.entiry.Registration;
@Repository
public interface SummaryRepository extends JpaRepository<Registration, Long> {

	Registration findByStudentId(Long studentId);

}
