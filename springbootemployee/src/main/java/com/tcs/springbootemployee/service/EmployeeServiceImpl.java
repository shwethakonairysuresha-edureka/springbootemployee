package com.tcs.springbootemployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootemployee.model.Employee;
import com.tcs.springbootemployee.repository.DepartmentRepository;
import com.tcs.springbootemployee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeServiceImpl()
//	{
//	}
//	
//	private static EmployeeService dao;
//	
//	public static EmployeeService getInstance()
//	{
//		if(dao == null)
//		{
//			dao = new EmployeeServiceImpl();
//			return dao;
//		}
//		return dao;
//	}
	
//	@Autowired
//	private EmployeeDAO employeeDao;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = null;
		try
		{
			employee2 = employeeRepository.save(employee);
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = null;
		try
		{
			employee2 = employeeRepository.save(employee);
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = employeeRepository.save(employee);
	}

}
