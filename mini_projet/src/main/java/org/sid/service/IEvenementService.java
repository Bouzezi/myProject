package org.sid.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.Evenement;
import org.sid.entities.User;

public interface IEvenementService {
	public Evenement consulterEvenement(int id);
	public void ajouterEvenement(String nom, String designation, Date date_deb, Date date_fin);
	public void modifierEvenement(int id,String nom, String designation, Date date_deb, Date date_fin);
	public void supprimerEvenement(int id);
	public void participerEvenement(String matricule, int id_evenement);
	public void annulerParticipation(String matricule);
	public List<Evenement> listerEvenements();
	public ArrayList<Adherent> listerAdherents();
	
}
