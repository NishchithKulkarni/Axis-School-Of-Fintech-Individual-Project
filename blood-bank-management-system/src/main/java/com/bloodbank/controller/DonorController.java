package com.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.model.DonorBean;
import com.bloodbank.serviceimpl.DonorService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DonorController {

	@Autowired
	DonorService donorService;
	
	@GetMapping("/donors")
	public List<DonorBean> displayDonors()
	{
		return donorService.getAllDonors();
	}
	
	@GetMapping("/donors/{did}")
	public DonorBean displayDonorById(Integer did)
	{
		return donorService.getDonor(did);
	}
	
	@PostMapping("/donors")
	public DonorBean addNewBean(@RequestBody DonorBean donor)
	{
		
		return donorService.addDonor(donor);
		
		
	}
}
