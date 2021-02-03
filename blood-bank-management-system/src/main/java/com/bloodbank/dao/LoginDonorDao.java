package com.bloodbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.DonorBean;

@Repository
public interface LoginDonorDao extends JpaRepository<DonorBean , Integer>{
	
	//@Query("SELECT don FROM donors don")
	//public List<DonorBean> donorDisplay();

}
