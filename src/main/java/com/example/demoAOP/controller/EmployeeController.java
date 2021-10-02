package com.example.demoAOP.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController;
import com.example.demoAOP.model.Employee;
import com.example.demoAOP.service.EmployeeService;  
@RestController  


public class EmployeeController {
@Autowired
private EmployeeService employeeService;
@RequestMapping(value="/add/employee",method=RequestMethod.GET)
public com.example.demoAOP.model.Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
{  
return employeeService.createEmployee(empId, firstName,lastName);  
}
@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)  
public String removeEmployee( @RequestParam("empId") String empId)
{
	employeeService.deleteEmployee(empId); 
	return "Employee removed";

}


}
