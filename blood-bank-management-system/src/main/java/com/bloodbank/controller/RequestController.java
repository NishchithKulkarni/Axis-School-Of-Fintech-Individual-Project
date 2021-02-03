package com.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.model.RequestBean;
import com.bloodbank.serviceimpl.RequestService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RequestController {

	@Autowired
	RequestService requestService;
	
	@GetMapping("/requests")
	public List<RequestBean> displayRequests()
	{
		return requestService.getAllRequests();
	}
	
	@GetMapping("/requests/{id}")
	public RequestBean displayRequestById(@PathVariable Integer id)
	{
		return requestService.getRequest(id);
		
	}
	
	@DeleteMapping("/requests/{id}")
	public void deleteRequestById(@PathVariable Integer id)
	{
		requestService.deleteRequest(id);
	}
	
	@PostMapping("/requests")
	public RequestBean addNewRequest(@RequestBody RequestBean request) {
		
		
		
		
		return   requestService.addRequest(request);
		
	}
	
	
}
