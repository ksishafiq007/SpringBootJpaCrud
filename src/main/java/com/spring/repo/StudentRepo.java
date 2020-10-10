package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.StudentEntity;


public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}
