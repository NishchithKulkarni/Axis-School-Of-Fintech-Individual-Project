package com.bloodbank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.model.BloodStorageBean;
import com.bloodbank.model.DonorBean;
import com.bloodbank.model.RequestBean;
@Service
public class LoginClassController {
	
	@Autowired
	private LoginService loginService;
	
	public List<RequestBean> listOfRequests() {
		return loginService.getRequests();
	}
	
	public List<DonorBean> listOfDonors() {
		return loginService.getDonors();
	}
	
	public List<BloodStorageBean> listOfBloodBanks(){
		return loginService.getBloodBanks();
	}
	
}
