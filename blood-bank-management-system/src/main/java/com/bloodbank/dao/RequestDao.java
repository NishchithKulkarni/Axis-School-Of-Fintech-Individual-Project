package com.bloodbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.bloodbank.model.RequestBean;

public interface RequestDao extends JpaRepository<RequestBean , Integer>{
	
	//@Query("INSERT INTO requests VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9)")
	//RequestBean InsertIntoRequest(RequestBean requestBean);
	
	 List<RequestBean> deleteById(int id);
	
	// List<RequestBean>
	// List<RequestBean> findByFirst_name(String first_name);
	
}
