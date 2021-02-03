package com.bloodbank.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.bloodbank.dao.DonorDao;
import com.bloodbank.dao.RequestDao;
import com.bloodbank.model.DonorBean;
import com.bloodbank.model.RequestBean;
import com.bloodbank.serviceimpl.DonorService;
import com.bloodbank.serviceimpl.RequestService;
@SpringBootTest
public class DonorServiceTest {
	
		@InjectMocks
	    DonorService donorService;

	    @Mock
	    private DonorDao donorDao;

	    @BeforeEach
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	    
	    @Test
		public void getAllDonorsTest() {
			 List<DonorBean> donors = new ArrayList<>();
			 donors.add(new DonorBean("Manish","Hundekar","manish@gmail.com","990088","A+","11/11/2020","2","LIG Colony","Bidar","22","MALE"));
			 donors.add(new DonorBean("Manish","Hundekar","manish@gmail.com","990088","A+","11/11/2020","2","LIG Colony","Bidar","22","MALE"));
			 donors.add(new DonorBean("Manish","Hundekar","manish@gmail.com","990088","A+","11/11/2020","2","LIG Colony","Bidar","22","MALE"));
			 when(donorDao.findAll()).thenReturn(donors);
		        
		     //System.out.println(requestService.getAllRequests().size());   
			 assertEquals(3, donorService.getAllDonors().size());
		}
		@Test
		public void addDonorTest() {
			DonorBean donor = new DonorBean("Manish","Hundekar","manish@gmail.com","990088","A+","11/11/2020","2","LIG Colony","Bidar","22","MALE");
			
			when(donorDao.save(donor)).thenReturn(donor);
			assertEquals(donor,donorService.addDonor(donor));
		}
}
