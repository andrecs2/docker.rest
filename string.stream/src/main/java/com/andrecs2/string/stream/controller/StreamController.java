package com.andrecs2.string.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andrecs2.string.stream.bean.Retorno;
import com.andrecs2.string.stream.model.Stream;
import com.andrecs2.string.stream.service.StreamService;

@RestController
@RequestMapping
public class StreamController {

	@Autowired
	private StreamService streamService;

	@ResponseBody
	@RequestMapping(value = "/stream/{stream}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Retorno stream(@PathVariable(value = "stream") String stream) {
		return streamService.find(stream, System.currentTimeMillis());
	}

	@ResponseBody
	@RequestMapping(value = "/stream", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Stream> stream() {
		return streamService.findAll();
	}

}
