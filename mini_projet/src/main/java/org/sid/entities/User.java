package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_user",
discriminatorType = DiscriminatorType.STRING)
public abstract class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String matricule;
	private String nom;
	private String prenom;
	private Date date_naiss;
	private String email;
	private String fonction;
	private String mot_passe;
	
	@OneToMany(mappedBy = "user")
	List<Participer>participer;
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name="participer", joinColumns= {@JoinColumn(name="matricule")},
	 * inverseJoinColumns= {@JoinColumn(name="id")}) private
	 * List<Evenement>evennements;
	 */
	@OneToMany(mappedBy="administrateur")
	private  List<Evenement>evennements;
	
	public User(String matricule, String nom, String prenom, Date date_naiss, String email, String fonction,
			String mot_passe) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naiss = date_naiss;
		this.email = email;
		this.fonction = fonction;
		this.mot_passe = mot_passe;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getMot_passe() {
		return mot_passe;
	}

	public void setMot_passe(String mot_passe) {
		this.mot_passe = mot_passe;
	}
	
}
