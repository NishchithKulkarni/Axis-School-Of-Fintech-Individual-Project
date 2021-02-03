package com.bloodbank.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.BloodStorageBean;

@Repository
public interface BloodBankDao extends JpaRepository<BloodStorageBean,Integer>{
	
	/*@Query(value = "SELECT b.amount FROM blood_storage b WHERE b.blood_type = (:blood_type)  AND b.city = (:city)", nativeQuery = true)
	public BloodStorageBean findAmount(@Param("blood_type")String blood_type,@Param("city")String city);*/
	
	@Query("SELECT b.amount FROM BloodStorageBean b WHERE b.blood_type = ?1  AND b.city = ?2")
	public String findAmount(@Param("blood_type") String blood_type, @Param("city") String city);
	
}
