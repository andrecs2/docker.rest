package com.andrecs2.string.stream.bean;

import java.io.Serializable;

import com.andrecs2.string.stream.model.Stream;

public class Retorno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7160882192234087124L;
	private String stream;
	private String vogal;
	private String tempoTotal;
	
	private Retorno(Builder builder) {
		this.vogal = builder.vogal;
		this.tempoTotal = builder.tempoTotal;
		this.stream = builder.stream;
	}

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
	
	public static class Builder {

		public String vogal;

		public String stream;

		public String tempoTotal;

		public Builder(Stream obj) {
			this.tempoTotal = obj.getTempoTotal();
			this.stream = obj.getStream();
			this.vogal = obj.getVogal();
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

		public String getStream() {
			return stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}

		public Retorno build() {
			return new Retorno(this);
		}

	}
}
