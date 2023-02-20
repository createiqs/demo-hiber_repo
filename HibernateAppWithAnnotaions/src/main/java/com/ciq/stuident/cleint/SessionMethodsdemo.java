package com.ciq.stuident.cleint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ciq.stuident.entity.Student;

public class SessionMethodsdemo {

	public static void main(String[] args) {
//		Student student=new Student( "balu", 23000.00, "balut@gmail.com");
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
		session.beginTransaction().begin();
		Student student = (Student) session.get(Student.class, 1);
		System.out.println(student);

		if (session.isConnected()) {
			System.out.println("connected");
		} else {
			System.out.println("not connected");
		}

		session.close();

		if (session.isConnected()) {
			System.out.println("connected");
		} else {
			System.out.println("not connected");
		}

	}

}
