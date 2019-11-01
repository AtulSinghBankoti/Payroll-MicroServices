package com.payroll.microservices.employeepayrollservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class EmployeePayroll {

	private int port;
	
	
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	
	@Id
	@GeneratedValue
	@Column(name = "payroll_id" )
	private Long payrollId;
	
	@Column(name = "emp_id")
	private Long empId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "role_id" )
	private Long roleId;
	
	@Column(name = "role_name")
	private String roleName;

	@Column(name = "role_desc")
	private String roleDescription;
	
	

	public EmployeePayroll(Long payrollId, Long empId, String firstName, String lastName, Long roleId, String roleName,
			String roleDescription) {
		super();
		this.payrollId = payrollId;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public EmployeePayroll() {}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return roleDescription;
	}

	public void setDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Long getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
