package com.payroll.microservices.employeepayrollservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class EmployeePyrollController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeePyrollController.class);
	
	@Autowired
	EmployeePayrollRepository employeePayrollRepository; 
	
	@Autowired
	EmployeeService employeeService; 
	
	@Autowired
	RoleService roleService; 
	
	@PostMapping("/employee/{empId}/role/{roleName}")
	public EmployeePayroll insertEmployeePayrollDtails(@PathVariable Long empId, 
			@PathVariable String roleName) {
		
		logger.info("inside insertEmployeePayrollDtails...");
		//ResponseEntity<EmployeePayroll> employeeEntity = new RestTemplate().getForEntity("http://localhost:8081/employee/{empId}", EmployeePayroll.class,
		//		empId);
		
		//ResponseEntity<EmployeePayroll> roleEntity = new RestTemplate().getForEntity("http://localhost:8101/role/{roleName}", EmployeePayroll.class,
		//		roleName);
		
		//EmployeePayroll employeePayroll = new EmployeePayroll(1L,100L,"AAA", "BBB", 1001L, "HR", "Human Resource");
		//EmployeePayroll employeePayroll = employeeEntity.getBody();
		
		EmployeePayroll employeePayroll = employeeService.getEmployeeDetails(empId);
		EmployeePayroll employeePayroll2 = roleService.getRoleByRoleName(roleName);
		//employeePayroll.setRoleId(roleEntity.getBody().getRoleId());
		//employeePayroll.setRoleName(roleEntity.getBody().getRoleName());
		//employeePayroll.setDescription(roleEntity.getBody().getDescription());
		
		employeePayroll.setRoleId(employeePayroll2.getRoleId());
		employeePayroll.setRoleName(employeePayroll2.getRoleName());
		employeePayroll.setDescription(employeePayroll2.getDescription());
		
		employeePayrollRepository.save(employeePayroll);
		return employeePayroll;
	}
}
