package com.bloodbank.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.RequestDao;
import com.bloodbank.exceptions.RequestNotFoundException;
import com.bloodbank.model.RequestBean;

@Service
public class RequestService {
	@Autowired
	private RequestDao requestDao;
	
	public List<RequestBean> getAllRequests(){
		return requestDao.findAll();
	}
	
	public RequestBean getRequest(Integer id)
	{
		return requestDao.findById(id).orElseThrow(()->new RequestNotFoundException("Request details not found for id "+ id));
	}
	
	public RequestBean addRequest(RequestBean request)
	{
		return requestDao.save(request);
	}
	
	public void deleteRequest(Integer id)
	{
		requestDao.deleteById(id);
	}
	
	/*public List<RequestBean> getRequestByName(String first_name) {
		return requestDao.findByFirst_name(first_name);
	}*/
}
