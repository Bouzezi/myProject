package org.sid.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.sid.dao.EvenementRepository;
import org.sid.dao.ParticiperRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Adherent;
import org.sid.entities.Evenement;
import org.sid.entities.Participer;
import org.sid.entities.ParticiperCle;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class EvenementServiceImpl implements IEvenementService{
	@Autowired
	private EvenementRepository evenementRepository;
	@Autowired
	private ParticiperRepository participerRepository;
	//@Autowired
	//private ParticiperCleRepository participerCleRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Evenement consulterEvenement(int id) {
		Evenement e=evenementRepository.getOne(id);
		if (e==null) throw new RuntimeException("Evennement Introuvable");
		return e;
	}

	@Override
	public void ajouterEvenement(String nom, String designation, Date date_deb, Date date_fin) {
		Evenement e=new Evenement(nom,designation,date_deb,date_fin);
		evenementRepository.save(e);
		
	}

	@Override
	public void modifierEvenement(int id,String nom, String designation, Date date_deb, Date date_fin) {
		Evenement e=consulterEvenement(id);
		e.setNom(nom);
		e.setDesignation(designation);
		e.setDate_deb(date_deb);
		e.setDate_fin(date_fin);
		evenementRepository.save(e);	
	}

	@Override
	public void supprimerEvenement(int id) {
		Evenement e=consulterEvenement(id);
		evenementRepository.delete(e);	
		//cascade
	}

	@Override
	public void participerEvenement(String matricule, int id_evenement) {
		ParticiperCle pc=new ParticiperCle(matricule,id_evenement);
		participerRepository.save(new Participer(pc,null,new Date()));	
	}

	@Override
	public List<Evenement> listerEvenements() {
		List<Evenement>liste=evenementRepository.findAll();
		return liste;
	}

	@Override
	public ArrayList<Adherent> listerAdherents() {
		//return userRepository.listerAdherents();
		return null;
	}

	@Override
	public void annulerParticipation(String matricule) {
		// TODO Auto-generated method stub
		
	}

}
