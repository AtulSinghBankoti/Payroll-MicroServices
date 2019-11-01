package com.payroll.microservices.employeepayrollservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {

}
