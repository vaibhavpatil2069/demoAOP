package com.example.demoAOP.aspect;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before; 
import org.springframework.stereotype.Component;  

@Aspect  
@Component  
public class EmployeeServiceAspect   
{  
@Before(value = "execution(* com.example.demoAOP.service.EmployeeService.*(..)) and args(empId, fname, lname)")  
public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String lname) {  
System.out.println("Before method:" + joinPoint.getSignature());  
System.out.println("Creating Employee with first name - " + fname + ", Last name - " + lname + " and id - " + empId);  
}  
}  
