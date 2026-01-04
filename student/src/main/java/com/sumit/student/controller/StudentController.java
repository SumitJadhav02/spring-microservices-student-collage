package com.sumit.student.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.student.entity.Student;
import com.sumit.student.service.StudentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/students")
public class StudentController {

  
    private final  StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return service.getStudent(id);
    }
    
    @GetMapping
    public ResponseEntity<List<Student>> getAll()
    {
    	return ResponseEntity.ok(service.getAllStudents());
    }
    
    @GetMapping("/collage/{collegeId}")
    public ResponseEntity<List<Student>> getStudentsByCollageId(@PathVariable("collegeId") Long collegeId)
    {
    	List<Student> list = service.getAllStudentsByCollageID(collegeId);
    	
    	return ResponseEntity.ok(list);
    }
    
}

