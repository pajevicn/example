package com.posta.promet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
	@Id
	@GeneratedValue
	
	Long id;
	String imePosaljioca;
	String imePrimaoca;
	Boolean preporuceno;
	public Data(Long id, String imePosaljioca, String imePrimaoca, Boolean preporuceno) {
		super();
		this.id = id;
		this.imePosaljioca = imePosaljioca;
		this.imePrimaoca = imePrimaoca;
		this.preporuceno = preporuceno;
	}
	
	public Data() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImePosaljioca() {
		return imePosaljioca;
	}

	public void setImePosaljioca(String imePosaljioca) {
		this.imePosaljioca = imePosaljioca;
	}

	public String getImePrimaoca() {
		return imePrimaoca;
	}

	public void setImePrimaoca(String imePrimaoca) {
		this.imePrimaoca = imePrimaoca;
	}

	public Boolean getPreporuceno() {
		return preporuceno;
	}

	public void setPreporuceno(Boolean preporuceno) {
		this.preporuceno = preporuceno;
	}
	
	
}
