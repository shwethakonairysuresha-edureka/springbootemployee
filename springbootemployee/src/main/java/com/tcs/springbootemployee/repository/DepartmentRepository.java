package com.tcs.springbootemployee.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootemployee.model.Department;
import com.tcs.springbootemployee.model.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	List<Department> findByEmployee(Employee employee, Sort sort);
	
	Boolean existsByName(String name);
}
