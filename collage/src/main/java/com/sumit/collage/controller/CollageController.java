package com.sumit.collage.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.collage.dto.CollageResponse;
import com.sumit.collage.entity.Collage;
import com.sumit.collage.service.CollageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/collage")
@RequiredArgsConstructor
public class CollageController {

	private final CollageService collageService;
	
	@PostMapping
	public ResponseEntity<Collage> save(@RequestBody Collage collage)
	{
		return ResponseEntity.ok(collageService.saveCollage(collage));
	}
	
	@GetMapping
	public ResponseEntity<List<Collage>>getAllCollages()
	{
		List<Collage> list = collageService.getAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CollageResponse> getById(@PathVariable("id") Long id)
	{
		CollageResponse c = collageService.getById(id);
		
		return ResponseEntity.ok(c);
	}
}
