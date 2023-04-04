package com.cognizant.project.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExecuteQuery implements ExecuteQueryInf {

	@Autowired
	JdbcTemplate jdbc;
	
	
	@Override
	public int Execute(String f_name, String l_name, String DOB, String sex, String country, String city, int pincode) {
		// TODO Auto-generated method stub
		
		return jdbc.update(
			      "INSERT INTO Registrations(firstname,lastname,sex,DOB,country,city,pincode) VALUES (?, ?, ?, ?, ?, ?, ?)", f_name,l_name ,sex, DOB,country,city,pincode);
		
	}

}
