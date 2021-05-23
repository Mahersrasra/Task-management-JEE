package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class employe {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Idemploye;
	private String nomemploye;
	private String eemail;
	public employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employe(Long idemploye, String nomemploye, String eemail, String epass) {
		super();
		Idemploye = idemploye;
		this.nomemploye = nomemploye;
		this.eemail = eemail;
		this.epass = epass;
	}
	public Long getIdemploye() {
		return Idemploye;
	}
	public void setIdemploye(Long idemploye) {
		Idemploye = idemploye;
	}
	public String getNomemploye() {
		return nomemploye;
	}
	public void setNomemploye(String nomemploye) {
		this.nomemploye = nomemploye;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	private String epass;
	@OneToMany (mappedBy="employe")
	private List <tache> taches;
	}
