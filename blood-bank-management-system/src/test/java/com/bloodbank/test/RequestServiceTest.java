package com.bloodbank.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.bloodbank.dao.RequestDao;
import com.bloodbank.model.RequestBean;
import com.bloodbank.serviceimpl.RequestService;

//import org.junit.Before;
import org.junit.jupiter.api.Test;
@SpringBootTest
class RequestServiceTest {
	
	
	@InjectMocks
    RequestService requestService;

 

    @Mock
    private RequestDao requestDao;

 

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void getAllRequestsTest() {
		 List<RequestBean> requests = new ArrayList<>();
		 requests.add(new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar"));
		 requests.add(new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar"));
		 requests.add(new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar"));
		 when(requestDao.findAll()).thenReturn(requests);
	        
	     //System.out.println(requestService.getAllRequests().size());   
		 assertEquals(3, requestService.getAllRequests().size());
	}
	
	@Test
	public void addRequestTest() {
		RequestBean request = new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar");
		
		when(requestDao.save(request)).thenReturn(request);
		assertEquals(request,requestService.addRequest(request));
	}
	/*@Test
	public void getRequestTest() {
		int id=100;
		RequestBean request = new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar");
		RequestBean expected=requestService.getRequest(id);
	}
	
	 @Test
	    public void deleteRequestTest() {        
		 RequestBean request = new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar");
	        requestService.deleteRequest(100);
	        verify(requestDao, atLeastOnce()).deleteRequest(100);
	    }*/
}
