package com.ciq.stuident.cleint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ciq.stuident.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student = new Student("sita", 23000.00, "sita@gmail.com");
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		System.out.println("step1............................");
		session.persist(student);
		System.out.println(student);
		System.out.println("step2............................");
		student.setName("sitaram");
		System.out.println("step3............................");
		session.getTransaction().commit();
		System.out.println("step4............................");
		session.close();
		System.out.println("step5............................");
//		Transaction tx = session.beginTransaction();
//		session.persist(student);
//		session.close();
//		session.beginTransaction().begin();
//		session.getSession().beginTransaction();
//		Student student = (Student)session.get(Student.class, 100);
//		Student student = (Student)session.load(Student.class, 1);
//		System.out.println(student);

//		Student student = (Student) session.get("balu", Student.class);
//		student.setEmail("balu@ciq.com");
//		session.update(student);

	}

}
