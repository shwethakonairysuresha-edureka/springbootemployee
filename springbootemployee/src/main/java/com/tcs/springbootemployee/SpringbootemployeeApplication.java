package com.tcs.springbootemployee;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.springbootemployee.model.Department;
import com.tcs.springbootemployee.model.Employee;
import com.tcs.springbootemployee.model.Organization;
import com.tcs.springbootemployee.repository.DepartmentRepository;
import com.tcs.springbootemployee.repository.OrganizationRepository;
import com.tcs.springbootemployee.service.EmployeeService;

@SpringBootApplication
public class SpringbootemployeeApplication {

	public static void displayMenu(int opts[], String items[])
	{
		//Display Menu
		System.out.println("MENU");
		System.out.println("------");
		for(int i = 0;i<opts.length;i++)
		{
			System.out.printf("%d. %s\n", opts[i], items[i]);
		}
		System.out.println("-------");
		System.out.println("Enter Choice: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User Choice
		int choice;
		int options[] = {1, 2, 3, 4, 5, 6, 7};
		String menuItems[] = {"Add Emlopyee", "Update Emlopyee", "Delete Emlopyee", "Find By Id", "Get Employees", "Find By OrganizationId", "EXIT"};
		int exit = options[options.length-1];
		
		//Display Menu
		displayMenu(options, menuItems);
		
		//Set up Scanner
		Scanner in = new Scanner(System.in);
		
		//Get choice from user
		choice = in.nextInt();
		
		//Check choice value
		while(choice != exit)
		{
			if(choice == options[0])
			{
				System.out.println("Add Emlopyee");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				Employee employee = new Employee(1, 01, 001, "Kakashi", 26, "Associate", null);
				String result = employeeService.addEmployee(employee);
				System.out.println(result);
				
				DepartmentRepository departmentRepository = context.getBean(DepartmentRepository.class);
				OrganizationRepository organizationRepository = context.getBean(OrganizationRepository.class);
				
				departmentRepository.save(new Department(3, 03, "Physics", null, null));
				departmentRepository.save(new Department(1, 01, "Biology", null, null));
				
				organizationRepository.save(new Organization(01, "XYZ", "123 Main Street"));
				//context.close();
			}
			else if(choice == options[1])
			{
				System.out.println("Update Emlopyee");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				Employee employee = new Employee(1, 01, 001, "Sasuke", 26, "Intern", null);
				String result = employeeService.updateEmployee(employee);
				System.out.println(result);
				//context.close();
			}
			else if(choice == options[2])
			{
				System.out.println("Delete Emlopyee");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				String result = employeeService.deleteEmployee(1);
				System.out.println(result);
				//context.close();	
			}
			else if(choice == options[3])
			{
				System.out.println("Find By Id");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				Optional<Employee> result = employeeService.findById(1);
				System.out.println(result);
				//context.close();		
			}
			else if(choice == options[4])
			{
				System.out.println("Get Employees");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				Optional<List<Employee>> result = employeeService.getEmployees();
				System.out.println(result);
				//context.close();	
			}
			else if(choice == options[5])
			{
				System.out.println("Find By OrganizationId");
				ApplicationContext context = SpringApplication.run(SpringbootemployeeApplication.class, args);
				//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
				EmployeeService employeeService = context.getBean(EmployeeService.class);
				Optional<List<Employee>> result = employeeService.findByOrganizationId(1);
				System.out.println(result);
				//context.close();		
			}
			
			//Display Menu
			displayMenu(options, menuItems);
			
			//Get choice from user
			choice = in.nextInt();
		}
		System.out.println("GoodBye!");
	}
}