package com.hcl.ingit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingit.entiry.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
