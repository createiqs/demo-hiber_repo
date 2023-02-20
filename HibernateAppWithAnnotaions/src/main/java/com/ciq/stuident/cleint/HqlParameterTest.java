package com.ciq.stuident.cleint;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ciq.stuident.util.HibernateUtil;

public class HqlParameterTest {

	 

	public static void main(String[] args) {
	Session session = HibernateUtil.getSession();
	session.getTransaction().begin();
//	Query query=session.createQuery("select s.name, s.fee, s.email from Student s where s.id=: sid");
//	query.setParameter("sid", 1);
//	List<Object[]> students=query.list();
//	for (Object[] objects : students) {
//		System.out.println(objects[0]);
//		System.out.println(objects[1]);
//		System.out.println(objects[2]);
////		System.out.println(objects[3]);
//	}
	
	Query query=session.createQuery("select s.name, s.fee, s.email from Student s where s.id=?");
	query.setInteger(0, 1);
//	query.setParameter(1, "Dinesh Rajput")
	List<Object[]> result = query.list();
	for (Object[] object : result) {
		System.out.println(Arrays.toString(object));
	}
	HibernateUtil.closeSession(session);
	
	}

}
