package com.cognizant.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.service.Service_Interface;

@Controller
public class HomeController {
	
	@Autowired
	Service_Interface service;
	
	@GetMapping("/")
	public String Method_1() {
		return "index";
	}
	
	@PostMapping("submit")
	public String method_2(@RequestParam("firstname") String f_name,@RequestParam("lastname") String l_name,@RequestParam("DOB") String DOB,@RequestParam("sex") String sex,@RequestParam("city") String city,@RequestParam("country") String country,@RequestParam("pincode") int pincode) {
		if(service.Insert(f_name, l_name, DOB, sex, country, city, pincode)) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
		return "index";
	}

}
