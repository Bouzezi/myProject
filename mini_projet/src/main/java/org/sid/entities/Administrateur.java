package org.sid.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("Admin")
public class Administrateur extends User {
	
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String matricule, String nom, String prenom, Date date_naiss, String email, String fonction,
			String mot_passe) {
		super(matricule, nom, prenom, date_naiss, email, fonction, mot_passe);
		// TODO Auto-generated constructor stub
		
	}
	
}
