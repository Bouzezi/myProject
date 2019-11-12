package org.sid.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Participer {
	@EmbeddedId 
	private ParticiperCle id;
	
	@ManyToOne
    @MapsId("matricule")
    @JoinColumn(name = "matricule_id")
   private User user;
	
	@ManyToOne
    @MapsId("id")
    @JoinColumn(name = "evennement_id")
   private Evenement evennement;
	
   private String feed_back;
   private Date date_participation;
    public Participer() {
	super();
	// TODO Auto-generated constructor stub
    }

	public Participer(ParticiperCle id,String feed_back,Date date_participation) {
		super();
		this.id = id;
		this.date_participation=date_participation;
		this.feed_back = feed_back;
	}

	public ParticiperCle getId() {
		return id;
	}

	public void setId(ParticiperCle id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Evenement getEvennement() {
		return evennement;
	}

	public void setEvennement(Evenement evennement) {
		this.evennement = evennement;
	}

	public String getFeed_back() {
		return feed_back;
	}

	public void setFeed_back(String feed_back) {
		this.feed_back = feed_back;
	}
   	
}
