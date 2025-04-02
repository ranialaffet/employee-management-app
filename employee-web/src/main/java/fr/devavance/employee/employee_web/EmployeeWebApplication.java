package fr.devavance.employee.employee_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"fr.devavance.employee"})
public class EmployeeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeWebApplication.class, args);
	}

}
