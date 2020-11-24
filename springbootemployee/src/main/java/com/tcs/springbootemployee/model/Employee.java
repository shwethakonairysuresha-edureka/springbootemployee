package com.tcs.springbootemployee.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int organizationId;
	private int departmentId;
	private String name;
	private int age;
	private String position;
	
	@OneToMany(mappedBy = "employee" , fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private Set<Department> departments = new HashSet<>();	
}
