package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ParticiperCle implements Serializable{

    @Column(name = "matricule_id")
    String user_id;
 
    @Column(name = "evennement_id")
    int evennement_id;

	public ParticiperCle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParticiperCle(String user_id, int evennement_id) {
		super();
		this.user_id = user_id;
		this.evennement_id = evennement_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getEvennement_id() {
		return evennement_id;
	}

	public void setEvennement_id(int evennement_id) {
		this.evennement_id = evennement_id;
	}
    
}
