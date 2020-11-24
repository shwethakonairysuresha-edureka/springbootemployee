package com.tcs.springbootemployee.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springbootemployee.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int id);
	public Optional<Employee> findById(int id);
	public Optional<List<Employee>> getEmployees();
	public Optional<List<Employee>> findByOrganizationId(int id);
	
	public void registerEmployee(Employee employee);
}
