package com.example.demoAOP.service;
import org.springframework.stereotype.Service;  
import com.example.demoAOP.model.Employee;  
@Service 

public class EmployeeService {

	public Employee createEmployee( String empId, String fname, String lname)
	{
		Employee emp = new Employee();  
		emp.setEmpId(empId);  
		emp.setFirstName(fname);  
		emp.setLastName(lname);  
		return emp;

	}
	public void deleteEmployee(String empId)
	{
		
	}
	

}
