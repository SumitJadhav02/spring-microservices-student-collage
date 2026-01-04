package com.sumit.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findByCollegeId(Long collegeId);
}

