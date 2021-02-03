package com.bloodbank.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

import com.bloodbank.model.RequestBean;
import com.bloodbank.model.*;

public class LoginResponseDto {
	
	List<RequestBean> requestList;
	
	public List<RequestBean> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<RequestBean> requestList) {
		this.requestList = requestList;
	}

	public List<DonorBean> getDonorList() {
		return donorList;
	}

	public void setDonorList(List<DonorBean> donorList) {
		this.donorList = donorList;
	}

	public List<BloodStorageBean> getBloodStorageList() {
		return bloodStorageList;
	}

	public void setBloodStorageList(List<BloodStorageBean> bloodStorageList) {
		this.bloodStorageList = bloodStorageList;
	}

	List<DonorBean> donorList;
	
	List<BloodStorageBean> bloodStorageList;

}
