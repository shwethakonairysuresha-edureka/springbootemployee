package com.tcs.springbootemployee.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int organizationId;
	private String name;
    //private List<Employee> employees;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name="employee_department",joinColumns = @JoinColumn(name="employee_id"),
	inverseJoinColumns = @JoinColumn(name="department_id"))
	private Employee employee;
	
	@ManyToMany
	@JoinTable(name="department_organizations",joinColumns = @JoinColumn(name="department_id"),
	inverseJoinColumns = @JoinColumn(name="organization_id"))
	private Set<Organization> organizations = new HashSet<>();
}
