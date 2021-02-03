package com.bloodbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.Restcontroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bloodbank.model.BloodStorageBean;
import com.bloodbank.serviceimpl.EnquireService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EnquireController {
	
	@Autowired
	EnquireService enquireService;
	
	@GetMapping("/enquire/{blood_type}/{city}")
	public String displayAmount(@PathVariable("blood_type") String blood_type,@PathVariable("city") String city)
	{
		return enquireService.getAmount(blood_type, city);
	}
	@GetMapping("/bloodStorageDetails")
	public List<BloodStorageBean> displayBloodStorageDetails()
	{
		return enquireService.getBloodStorageDetails();
	}
	
}
  