package edu.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.institute.model.EmployeeModel;

@Service
public class EmployeeService {

	@Autowired // Is use to perform the DI
	EmployeeModel model;
	
	public void save() {
		model.saveEmployeeData();
	}
}
