package com.andrecs2.string.stream.bean;

import java.io.Serializable;

public class Retorno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7160882192234087124L;
	private String stream;
	private String vogal;
	private String tempoTotal;

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getVogal() {
		return vogal;
	}

	public void setVogal(String vogal) {
		this.vogal = vogal;
	}

	public String getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
}
