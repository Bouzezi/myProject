package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Evenement implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String designation;
	private Date date_deb;
	private Date date_fin;
	
	@OneToMany(mappedBy = "evennement")
	List<Participer>participer;
	
	@ManyToOne
	  @JoinColumn(name="matricule_admin",referencedColumnName = "matricule") 
	  private Administrateur administrateur;
	  
	  //@ManyToMany(mappedBy="evennements") private List<User>users;
	 
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(String nom, String designation, Date date_deb, Date date_fin) {
		super();
		this.nom = nom;
		this.designation = designation;
		this.date_deb = date_deb;
		this.date_fin = date_fin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDate_deb() {
		return date_deb;
	}
	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
}
