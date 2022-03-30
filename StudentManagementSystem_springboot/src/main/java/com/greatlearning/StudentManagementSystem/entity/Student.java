package com.greatlearning.StudentManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data

public class Student {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "deparment")
	private String department;
	
	@Column(name = "country")
	private String country;
	
	public Student(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}
	
	public Student() {
		
	}
}
