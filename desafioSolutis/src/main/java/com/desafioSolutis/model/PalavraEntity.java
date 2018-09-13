package com.desafioSolutis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PalavraEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String palavra;
	private String letra;
	
	
	public PalavraEntity() {
		super();
	}
	
	public PalavraEntity(String palavra, String letra) {
		super();
		this.palavra = palavra;
		this.letra = letra;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}

}
