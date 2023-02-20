package com.ciq.stuident.cleint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ciq.stuident.entity.Student;
import com.ciq.stuident.util.HibernateUtil;

public class HqlPractice {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();

//		getStudents(session);
		List<Object[]> students = session.createQuery("select s.name, s.fee, s.email from Student s").setMaxResults(2).list();
		for (Object[] student : students) {
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
		}
		
//		List<Object[]> students=	session.createQuery("select s.name, s.fee, s.email from Student s where s.id=1").list();
//
//		for (Object[] student : students) {
//			System.out.println(student[0]);
//			System.out.println(student[1]);
//			System.out.println(student[2]);
//		}
		HibernateUtil.closeSession(session);
	}

	public static void getStudents(Session session) {
//		Query query=session.createQuery("from Student");
//		List<Student> students=query.list();
		List<Student> students = session.createQuery("from Student").list();

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
