package com.greatlearning.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagementSystem.entity.*;


public interface StudentRepository extends JpaRepository<Student,Integer>{

	List<Student> findByNameContainsAndDepartmentContainsAllIgnoreCase(String name,String author);
}
