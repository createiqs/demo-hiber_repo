package com.ciq.acc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	public static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

	public static Session getSession() {
		sessionFactory = buildSessionFactory();
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void main(String[] args) {
	System.out.println(getSession());

	}

}
