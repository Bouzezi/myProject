package org.sid.dao;

import org.sid.entities.Participer;
import org.sid.entities.ParticiperCle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticiperRepository 
extends JpaRepository<Participer, ParticiperCle>{

}
