package com.tcs.springbootemployee.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springbootemployee.model.Department;

public interface DepartmentService {
	public String addDepartment(Department department);
	public String updateDepartment(Department department);
	public String deleteDepartment(int id);
	public Optional<Department> findById(int id);
	public Optional<List<Department>> getDepartments();
	public Optional<List<Department>> findByOrganizationId(int id);
	
	public String registerDepartment(Department department);
}
