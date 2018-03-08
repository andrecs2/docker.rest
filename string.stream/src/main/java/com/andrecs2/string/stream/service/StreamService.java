package com.andrecs2.string.stream.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrecs2.string.stream.bean.Retorno;
import com.andrecs2.string.stream.model.Stream;
import com.andrecs2.string.stream.repository.StreamRepository;

@Service
public class StreamService {

	@Autowired
	private StreamRepository repository;

	public Retorno find(String stream, long inicio) {

		String vogal = obterVogalSolitaria(stream);
		String tempoTotal = ((System.currentTimeMillis() - inicio) ) + " ms";
		Stream obj = new Stream.Builder().tempoTotal(tempoTotal).stream(stream).vogal(vogal).build();
		repository.save(obj);
		return new Retorno.Builder(obj).build();
	}

	public String obterVogalSolitaria(String stream) {
		Pattern pattern = Pattern.compile("([aeiouy][^aeiouy][aeiouy])", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stream);
		Map<String, Long> mapEnd = new LinkedHashMap<String, Long>();
		Map<String, Long> mapInicio = new LinkedHashMap<String, Long>();
		while (matcher.find()) {
			String group = matcher.group(1);
			stream = stream.substring(matcher.end() - 1);

			Pattern p2 = Pattern.compile("([aeiouy])([^aeiouy])([aeiouy])", Pattern.CASE_INSENSITIVE);
			Matcher m2 = p2.matcher(group);
			if (m2.find()) {
				String inicio = m2.group(1).toLowerCase();

				long cont = 1;
				if (mapInicio.containsKey(inicio)) {
					cont += mapEnd.get(inicio);
				}
				mapInicio.put(inicio, cont);

				String fim = m2.group(3).toLowerCase();
				cont = 1;
				if (!mapEnd.containsKey(fim)) {
					if (mapInicio.containsKey(fim)) {
						cont += mapInicio.get(fim);
					}
				} else {
					cont += mapEnd.get(fim);
				}
				mapEnd.put(fim, cont);
			}
			matcher = pattern.matcher(stream);
		}
		Collection<String> values = mapEnd.keySet();
		for (String key : values) {
			Long integer = mapEnd.get(key);
			if (integer == 1){
				return key;
			}
		}
		return "";
	}

	public Iterable<Stream> findAll() {
		return repository.findAll();
	}

}
