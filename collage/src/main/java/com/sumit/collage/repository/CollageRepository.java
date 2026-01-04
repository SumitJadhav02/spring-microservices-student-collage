package com.sumit.collage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumit.collage.entity.Collage;

@Repository
public interface CollageRepository extends JpaRepository<Collage, Long> {

}
