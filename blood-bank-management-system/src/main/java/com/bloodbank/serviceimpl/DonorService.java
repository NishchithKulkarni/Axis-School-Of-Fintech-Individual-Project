package com.bloodbank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.DonorDao;
import com.bloodbank.exceptions.RequestNotFoundException;
import com.bloodbank.model.DonorBean;
import com.bloodbank.model.RequestBean;

@Service
public class DonorService {

	@Autowired
	private DonorDao donorDao;
	
	public List<DonorBean> getAllDonors(){
		return donorDao.findAll();
	}
	
	public DonorBean getDonor(Integer id)
	{
		return donorDao.findById(id).orElseThrow(()->new RequestNotFoundException("Request details not found for id "+ id));
	}
	public DonorBean addDonor(DonorBean donor)
	{
		return donorDao.save(donor);
	}
	
	public void deleteDonor(Integer id)
	{
		donorDao.deleteById(id);
	}
}
