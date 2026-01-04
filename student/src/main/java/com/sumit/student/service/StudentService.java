package com.sumit.student.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.sumit.student.entity.Student;
import com.sumit.student.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository repository;
	
	 public Student saveStudent(Student student) {
	        return repository.save(student);
	    }

	    public Student getStudent(Long id) {
	        return repository.findById(id).orElse(null);
	    }
	    
	    public List<Student> getAllStudents()
	    {
	    	return repository.findAll();
	    }

		public List<Student> getAllStudentsByCollageID(Long collegeId) {
			
			return repository.findByCollegeId(collegeId);
		}
		
	    
}
