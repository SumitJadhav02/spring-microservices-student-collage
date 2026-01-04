package com.sumit.collage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sumit.collage.client.StudentClient;
import com.sumit.collage.dto.CollageResponse;
import com.sumit.collage.dto.StudentDto;
import com.sumit.collage.entity.Collage;
import com.sumit.collage.repository.CollageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CollageService {

	private final CollageRepository collageRepository;
	private final StudentClient client;
	
	
	public Collage saveCollage(Collage collage)
	{
		return collageRepository.save(collage);
	}
	
	public List<Collage> getAll()
	{
		return collageRepository.findAll();
	}
	
	/*public Collage getById(Long id)
	{
		return collageRepository.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
	}*/
	
	
	public CollageResponse getById(Long id)
	{
		Collage collage = collageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Collage not found"));
		
		List<StudentDto> students = client.getStudentsByCollegeId(id);
		
		CollageResponse response = new CollageResponse();
		
		response.setId(collage.getId());
		response.setName(collage.getName());
	    response.setStudents(students);
	    
	    return response;
		
		
		
	}
}
