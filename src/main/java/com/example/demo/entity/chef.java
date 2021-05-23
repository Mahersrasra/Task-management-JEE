package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class chef {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Idchef;
	private String nomchef;
	private String cemail;
	private String cpass;
	@OneToMany (mappedBy="chef")
	private List <board> boards;
	public Long getIdchef() {
		return Idchef;
	}
	public void setIdchef(Long idchef) {
		Idchef = idchef;
	}
	public String getNomchef() {
		return nomchef;
	}
	public void setNomchef(String nomchef) {
		this.nomchef = nomchef;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public chef(Long idchef, String nomchef, String cemail, String cpass) {
		super();
		Idchef = idchef;
		this.nomchef = nomchef;
		this.cemail = cemail;
		this.cpass = cpass;
	}
	public chef() {
		// TODO Auto-generated constructor stub
	}
	
	}
	

	
	

