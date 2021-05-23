package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class tache {@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long Idtache;
private String etat;
public tache() {
	super();
	// TODO Auto-generated constructor stub
}
public tache(Long idtache, String etat, com.example.demo.entity.board board, com.example.demo.entity.employe employe) {
	super();
	Idtache = idtache;
	this.etat = etat;
	this.board = board;
	this.employe = employe;
}
public Long getIdtache() {
	return Idtache;
}
public void setIdtache(Long idtache) {
	Idtache = idtache;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public board getBoard() {
	return board;
}
public void setBoard(board board) {
	this.board = board;
}
public employe getEmploye() {
	return employe;
}
public void setEmploye(employe employe) {
	this.employe = employe;
}
@ManyToOne 
@JoinColumn (name="Idboard")
private board board ;
@ManyToOne 
@JoinColumn (name="Idemploye")
private employe employe ;


}
