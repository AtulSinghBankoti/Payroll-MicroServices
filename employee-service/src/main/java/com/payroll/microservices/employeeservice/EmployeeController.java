package com.payroll.microservices.employeeservice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeRepository employeeRepository; 
	
	@Autowired
	Environment environment;
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeDetails(@PathVariable Long empId) {
		//return new Employee("Atul", "Singh", 101L, new Date()); 
		logger.info("insede getEmployeeDetails...");
		
		Employee employee= employeeRepository.findById(empId).get();
		employee.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return employee;
	}
	
}
