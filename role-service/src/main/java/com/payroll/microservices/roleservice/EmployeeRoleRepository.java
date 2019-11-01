package com.payroll.microservices.roleservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, Long> {

	public EmployeeRole findByRoleName(String roleName);
}
