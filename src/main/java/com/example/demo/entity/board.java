package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class board {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Idboard;
	private String DateCrea;
	@OneToMany (mappedBy="board")
	private List <tache> taches;
	public Long getIdboard() {
		return Idboard;
	}
	public void setIdboard(Long idboard) {
		Idboard = idboard;
	}
	public String getDateCrea() {
		return DateCrea;
	}
	public void setDateCrea(String dateCrea) {
		DateCrea = dateCrea;
	}
	public chef getChef() {
		return chef;
	}
	public void setChef(chef chef) {
		this.chef = chef;
	}
	public board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public board(Long idboard, String dateCrea, com.example.demo.entity.chef chef) {
		super();
		Idboard = idboard;
		DateCrea = dateCrea;
		this.chef = chef;
	}
	@ManyToOne 
	@JoinColumn (name="Idchef")
	private chef chef ;
}
