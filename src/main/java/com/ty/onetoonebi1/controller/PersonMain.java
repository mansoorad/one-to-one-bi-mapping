package com.ty.onetoonebi1.controller;

import com.ty.onetoonebi1.dao.AadharCardDao;
import com.ty.onetoonebi1.dao.PersonDao;
import com.ty.onetoonebi1.dto.AadharCard;
import com.ty.onetoonebi1.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Raj");
		person.setAge(27);
		person.setAddress("Bangalore");

		AadharCard aadharCard = new AadharCard();
		aadharCard.setName("Raj M");
		aadharCard.setPhone(34455);
		aadharCard.setAadharNumber(34376847);

		person.setAadharCard(aadharCard);
		aadharCard.setPerson(person);

		PersonDao dao = new PersonDao();
		dao.savePerson(person);

//		AadharCardDao dao1 = new AadharCardDao();
//		dao1.saveAadharCard(aadharCard);
	}
}
