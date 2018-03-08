package com.andrecs2.string.stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.andrecs2.string.stream.repository.StreamRepository;
import com.andrecs2.string.stream.service.StreamService;

@RunWith(SpringRunner.class)
public class StreamServiceTest {
	
	@Autowired
	StreamService streamService;

	@MockBean
	private StreamRepository repository;

	@TestConfiguration
	static class StreamServiceTestContextConfiguration {

		@Bean
		public StreamService streamService() {
			return new StreamService();
		}
	}

	@Test
	public void testeValido_1() {
		String vogal = streamService.obterVogalSolitaria("teleferico");
		Assert.assertEquals(vogal, "i");
	}
	@Test
	public void testeValido_2() {
		String vogal = streamService.obterVogalSolitaria("acordar");
		Assert.assertEquals(vogal, "o");
	}
	@Test
	public void testeValido_3() {
		String vogal = streamService.obterVogalSolitaria("aAbBABadicafe");
		Assert.assertEquals(vogal, "i");
	}
	@Test
	public void testeValido_4() {
		String vogal = streamService.obterVogalSolitaria("aAbBABacafe");
		Assert.assertEquals(vogal, "e");
	}
	

}