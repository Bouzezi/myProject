package org.sid;

import java.util.Date;

import org.sid.dao.EvenementRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Administrateur;
import org.sid.entities.Evenement;
import org.sid.entities.User;
import org.sid.service.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MiniProjetApplication implements CommandLineRunner{
	
	 @Autowired UserRepository userRepository;
	  
	  @Autowired EvenementRepository er;
	 
	 
	//IEvenementService evenementService;
	public static void main(String[] args) {
		
		 SpringApplication.run(MiniProjetApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new Administrateur("1235","ah","pren",new Date(),"dv","qdsf","sfd"));
		er.save(new Evenement("sdq", "f", new Date(), new Date()));
		
	}

	

}
