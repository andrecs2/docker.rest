package com.andrecs2.string.stream;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.andrecs2.string.stream.controller.StreamController;
import com.andrecs2.string.stream.service.StreamService;

@RunWith(SpringRunner.class)
@WebMvcTest(StreamController.class)
public class StreamControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private StreamService service;


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void whenPostEmployee_thenCreateEmployee() throws Exception {
		given(service.obterVogalSolitaria("teleferico")).willReturn("i");

//		mvc.perform(
//				get("/stream/teleferico")
//					.contentType(MediaType.APPLICATION_JSON)
//		)
//		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
//			.andExpect(status().isOk());
//			.andExpect(jsonPath("$.vogal", is("i"))
//					);
//		verify(service, VerificationModeFactory.times(1)).save(Mockito.anyObject());
		reset(service);
	}

}
