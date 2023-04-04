package com.cognizant.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.project.dao.ExecuteQuery;

@Component
public class Service implements Service_Interface {
	
	@Autowired
	ExecuteQuery query;

	@Override
	public boolean Insert(String f_name, String l_name, String DOB, String sex, String country, String city,
			int pincode) {
		// TODO Auto-generated method stub
		
		if(query.Execute(f_name, l_name, DOB, sex, country, city, pincode)>0) {
			return true;
		}
		else {
			return false;
		}
	}

}
