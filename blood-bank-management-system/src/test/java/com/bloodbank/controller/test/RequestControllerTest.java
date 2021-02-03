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

import com.bloodbank.controller.RequestController;
import com.bloodbank.model.RequestBean;
import com.bloodbank.serviceimpl.RequestService;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@WebMvcTest(RequestController.class)
class RequestControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private RequestService requestService;
	
	@Test
	void displayRequestsTest() throws Exception {
		mvc.perform(get("/requests").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
	@Test
	void displayRequestByIdTest() throws Exception {
		
		mvc.perform(get("/requests/1001").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
	@Test
void addNewRequestTest() throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		RequestBean request = new RequestBean("Manish","Hundekar","manish@gmail.com","990088","A+","2","LIG Colony","Bidar");
		
		mvc.perform(post("/requests")
				.content(objectMapper.writeValueAsString(request))
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

}
