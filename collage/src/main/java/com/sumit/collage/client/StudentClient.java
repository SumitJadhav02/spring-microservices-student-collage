package com.sumit.collage.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sumit.collage.dto.StudentDto;



@FeignClient(name="STUDENT-SERVICE")
public interface StudentClient {

	@GetMapping("/api/students/collage/{collegeId}")
	List<StudentDto> getStudentsByCollegeId(@PathVariable("collegeId") Long collegeId);
}
