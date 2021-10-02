package com.example.demoAOP;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DemoAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAopApplication.class, args);
	}

}
