package org.sid.dao;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository 
extends JpaRepository<User, String> {
	//@Query("select u from User u where u.type_user= Adherent ")
	//public ArrayList<Adherent> listerAdherents();
}
