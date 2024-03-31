package com.example.demoJasperReports.repository;

import com.example.demoJasperReports.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}