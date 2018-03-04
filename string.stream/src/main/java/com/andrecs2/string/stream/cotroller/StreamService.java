package com.andrecs2.string.stream.cotroller;

import org.springframework.stereotype.Service;

import com.andrecs2.string.stream.bean.Retorno;

@Service
public class StreamService {

	public Retorno find(String stream, long inicio) {
		
		Retorno retorno = new Retorno();
		retorno.setStream(stream);
		retorno.setTempoTotal(((System.currentTimeMillis()-inicio)/1000)+" ms");
		return retorno;
	}
}
