package com.sumit.collage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {

	private Long id;
	private String name;
    private String email;
    private Long collegeId;
}
