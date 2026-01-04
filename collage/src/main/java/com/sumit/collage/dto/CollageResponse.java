package com.sumit.collage.dto;

import java.util.List;

import com.sumit.collage.entity.Collage;

import lombok.Data;

@Data
public class CollageResponse {

    private Long id;
    private String name;

    private List<StudentDto> students;
}
