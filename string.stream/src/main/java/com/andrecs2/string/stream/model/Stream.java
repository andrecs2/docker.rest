package com.andrecs2.string.stream.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Stream {

	@Id
	@Column(name = "pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String vogal;

	@Column
	private String tempoTotal;

	@Column(name="texto")
	private String stream;

	public Stream() {
	}

	private Stream(Builder builder) {
		this.vogal = builder.vogal;
		this.tempoTotal = builder.tempoTotal;
		this.stream = builder.stream;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setStream(String sream) {
		this.stream = sream;
	}

	public static class Builder {

		public String vogal;

		public String stream;

		public String tempoTotal;

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

		public Stream build() {
			return new Stream(this);
		}

		public Builder tempoTotal(String tempoTotal) {
			this.tempoTotal = tempoTotal;
			return this;
		}

		public Builder stream(String stream) {
			this.stream = stream;
			return this;
		}

		public Builder vogal(String vogal) {
			this.vogal = vogal;
			return this;
		}

	}

}
