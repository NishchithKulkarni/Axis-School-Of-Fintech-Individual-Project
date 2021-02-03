package com.bloodbank.test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bloodbank.dao.BloodBankDao;
import com.bloodbank.model.BloodStorageBean;
import com.bloodbank.serviceimpl.EnquireService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import com.manipal.model.*;
@SpringBootTest
public class EnquireServiceTest {

	@InjectMocks
	EnquireService enquireService;
	
	@Mock
	BloodBankDao bloodBankDao;
	
	 @BeforeEach
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	 @Test
	 public void getAmountTest()
	 {
		 String bloodMockList;
		 //bloodMockList.add(new BloodStorageBean("O-","2","Pune"));
		 String blood_type="O-";
		 String city="Pune";
		 String amount="2";
		 when(bloodBankDao.findAmount(blood_type, city)).thenReturn("2");
		 assertEquals(2, enquireService.getAmount(blood_type, city));
		 
	 }
}
