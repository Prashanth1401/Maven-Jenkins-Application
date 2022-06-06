package com.jenkins;

import java.util.List;
import java.util.Optional;

import com.jenkins.dto.Employee;
import com.jenkins.service.EmployeeServiceImpl;

public class App 
{
	  public static void main( String[] args )
	    {
	       EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	       Employee employee = new Employee(1401, "prashanth", 11000.0,"JAVA" );
	       Optional<Employee> addedEmpoyee= employeeService.addEmployee(employee);
	       if(addedEmpoyee.isPresent()) {
	    	   System.out.println("Employee added Success fully");
	       }
	       
	       List<Employee> employees = employeeService.getEmployees();
	       System.out.println(employees);
	       
	    }
}
