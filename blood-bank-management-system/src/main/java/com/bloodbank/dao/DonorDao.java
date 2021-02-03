package com.bloodbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bloodbank.model.DonorBean;

public interface DonorDao extends JpaRepository<DonorBean,Integer>{

	//@Query("INSERT INTO donors VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)")
	//DonorBean InsertIntoRequest(DonorBean donorBean);
	
	 List<DonorBean> deleteById(int id);
}
