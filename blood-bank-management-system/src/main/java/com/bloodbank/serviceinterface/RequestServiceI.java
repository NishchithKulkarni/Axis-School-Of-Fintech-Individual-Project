package com.bloodbank.serviceinterface;

import java.util.List;

import com.bloodbank.model.RequestBean;

public interface RequestServiceI {

	public List<RequestBean> getAllRequests();
	
	public RequestBean getRequest(Integer id);
	
	public RequestBean addRequest(RequestBean request);
	
	public void deleteRequest(Integer id);
}
