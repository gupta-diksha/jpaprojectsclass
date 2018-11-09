package com.cg.util;

import javax.persistence.*;

public class JPAUtil 
{
	static EntityManagerFactory emFact=null;
	static EntityManager entityManager=null;
	
	public static EntityManager getEntityManager()
	{
		emFact = Persistence.createEntityManagerFactory("JPA-PU-Oracle");
		entityManager=emFact.createEntityManager();
		return entityManager;
	}
	

}
