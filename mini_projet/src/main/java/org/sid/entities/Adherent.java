package org.sid.entities;


import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
@DiscriminatorValue("Adherent")
public class Adherent extends User  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Adherent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adherent(String matricule, String nom, String prenom, Date date_naiss, String email, String fonction,
			String mot_passe) {
		super(matricule, nom, prenom, date_naiss, email, fonction, mot_passe);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
