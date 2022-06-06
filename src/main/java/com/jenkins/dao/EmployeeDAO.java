package com.jenkins.dao;

import java.util.List;

import java.util.Optional;

import com.jenkins.dto.Employee;


public interface EmployeeDAO {
	
	public Optional<Employee> addEmployee(Employee employee);
	
	public Optional<Employee> updateEmployee(Employee employee);
	
	public Optional<Employee> getEmployeeById(Integer empId);
	
	public List<Employee> getEmployees();

}
