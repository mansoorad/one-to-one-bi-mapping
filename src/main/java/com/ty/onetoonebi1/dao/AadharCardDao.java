package com.ty.onetoonebi1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi1.dto.AadharCard;
import com.ty.onetoonebi1.dto.Person;

public class AadharCardDao {
	public void saveAadharCard(AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = aadharCard.getPerson();

		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();
	}

//	public AadharCard findAadharCard(int id) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		AadharCard aadharCard= entityManager.find(AadharCard.class, id);
//		return aadharCard;
//	}
//	
//	public void deleteAadharCard(int id) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		
//		AadharCard aadharCard= entityManager.find(AadharCard.class, id);
//		entityTransaction.begin();
//		entityManager.remove(aadharCard);
//		entityTransaction.commit();
//	}
//	
//	public void readAllAadharCard() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		AadharCard aadharCard = entityManager.find(AadharCard.class, null);
//		System.out.println(aadharCard);
//	}
//	
//	public void 
}
