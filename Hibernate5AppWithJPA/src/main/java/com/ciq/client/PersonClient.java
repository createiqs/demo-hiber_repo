package com.ciq.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ciq.entity.Person;

public class PersonClient {

	public static void main(String[] args) throws ParseException {

		String myDate = "1980/01/01";
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
//		Date ds = formatter.parse(myDate);
//		Calendar instance = Calendar.getInstance();
//		instance.
		LocalDate date = LocalDate.of(1985, 1, 1);
		ZoneId defaultZonedId = ZoneId.systemDefault();
		Date dob = Date.from(date.atStartOfDay(defaultZonedId).toInstant());
		Person person = new Person("balu", dob, "hyderabad");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.ciq.entity");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(person);
		tx.commit();
		Query query = entityManager.createQuery("from Person");
		List resultList = query.getResultList();
		System.out.println(resultList);
		entityManager.close();
	}

}
