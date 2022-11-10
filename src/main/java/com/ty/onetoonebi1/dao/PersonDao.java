package com.ty.onetoonebi1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi1.dto.AadharCard;
import com.ty.onetoonebi1.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		AadharCard aadharCard = person.getAadharCard();

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadharCard);
		entityTransaction.commit();

	}

	public Person findPerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, id);
		return person;
	}
}
