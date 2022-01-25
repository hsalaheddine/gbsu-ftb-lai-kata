package com.kata.gbsuftblai;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.kata.gbsuftblai.controllers.GbsuFtbLaiController;

@SpringBootTest
@AutoConfigureMockMvc
class GbsuFtbLaiApplicationTests {

	@Autowired
	private GbsuFtbLaiController controller;

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	
	
	@Test
	public void number1_should_return_1() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 1)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("1"));
	}
	
	@Test
	public void number_3_should_return_GbsuGbsu() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 3)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("GbsuGbsu"));
	}
	
	@Test
	public void number_5_should_return_FtbFtb() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 5)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("FtbFtb"));
	}

	
	@Test
	public void number_7_should_return_Lai() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 7)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("Lai"));
	}
	
	@Test
	public void number_9_should_return_Gbsu() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 9)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("Gbsu"));
	}
	
	@Test
	public void number_51_should_return_GbsuFtb() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 51)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())	
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("GbsuFtb"));
	}
	
	@Test
	public void number_53_should_return_FtbGbsu() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 53)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("FtbGbsu"));
	}
	
	@Test
	public void number_33_should_return_GbsuGbsuGbsu() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 33)
			.accept(MediaType.APPLICATION_JSON))
	 		.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("GbsuGbsuGbsu"));
	}


	@Test
	public void number_27_should_return_GbsuLai() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 27)
			.accept(MediaType.APPLICATION_JSON))
		    .andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("GbsuLai"));
	}
	
	@Test
	public void number_15_should_return_GbsuFtbFtb() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gbsu-ftb-lai/{inputNumber}", 15)
			.accept(MediaType.APPLICATION_JSON))
		 	.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value("GbsuFtbFtb"));
	}
	
}