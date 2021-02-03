package com.bloodbank.serviceinterface;

import java.util.List;

import com.bloodbank.model.DonorBean;

public interface DonorServiceI {
	
	public List<DonorBean> getAllDonors();
	
	public DonorBean getDonor(Integer id);
	
	public DonorBean addDonor(DonorBean donor);
	
	public void deleteDonor(Integer id);

}
