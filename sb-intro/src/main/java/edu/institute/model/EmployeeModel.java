package edu.institute.model;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeModel {
	public EmployeeModel() {
		System.out.println("Employee Object Created....");
	}
	
	
	public void saveEmployeeData() {
		System.out.println("Insert the Employee Data into DB");
	}
}
