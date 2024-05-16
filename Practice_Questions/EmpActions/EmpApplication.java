// Program to perform different operations in a given list of employees
// Concepts used : Spring boot,Maven,Records in java 17,Streams,Collections,Map,String 
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        System.out.println("Started the main function");
		EmployeeActionsImpl obj=new EmployeeActionsImpl();
	    obj.readDetails();

	}

}
