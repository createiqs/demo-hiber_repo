package com.ciq.stuident.cleint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ciq.stuident.entity.Student;
import com.ciq.stuident.util.HibernateUtil;

public class StudentUpdate {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();
		student.setId(1);
		student.setName("bala");
		student.setEmail("balu123@ciq.com");
		student.setFee(33000);
		session.update(student);
		tx.commit();
		HibernateUtil.closeSession(session);
		// get,load, save, saveorupdate, update, close, clear, evict
		// merge

	}

}
