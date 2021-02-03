package com.bloodbank.controller.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.bloodbank.controller.DonorController;
import com.bloodbank.model.DonorBean;
import com.bloodbank.model.RequestBean;
import com.bloodbank.serviceimpl.DonorService;
import com.fasterxml.jackson.databind.ObjectMapper;


@ExtendWith(SpringExtension.class)
@WebMvcTest(DonorController.class)
class DonorControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private DonorService donorService;
	
	@Test
	void displayDonorsTest() throws Exception {
		mvc.perform(get("/donors").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
	@Test
	void displayDonorByIdTest() throws Exception {
		
		mvc.perform(get("/donors/1001").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
	@Test
    void addNewDonorTest() throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		DonorBean donor = new DonorBean("Manish","Hundekar","manish@gmail.com","990088","A+","11/11/2020","2","LIG Colony","Bidar","22","MALE");
		
		mvc.perform(post("/donors")
				.content(objectMapper.writeValueAsString(donor))
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
}
