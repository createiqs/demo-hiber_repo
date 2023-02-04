package com.ciq.ems.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ciq.ems.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee = new Employee("createiq", "tech", 22000);
		Employee employee2 = new Employee("balu", "tech", 21000);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee2);
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		for (Employee employee3 : employees) {
			System.out.println(employee3);
		}
		tx.commit();
		session.close();

	}

}
