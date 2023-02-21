package com.ciq.cleint;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ciq.model.Doctor;
import com.ciq.model.Patient;
import com.ciq.util.HibernateUtil;

public class BidirectionalMapping {

	public static void main(String[] args) {
//		Patient patient = new Patient("arun", 123456777, "fever");
//		Doctor doctor = new Doctor("Jain", "Md", 500.00, patient);
//		Patient patient = new Patient("samatha", 34668900, "arthrities");
//		Doctor doctor = new Doctor("Varma", "orthopedic", 600.00, patient);
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
//		session.persist(doctor);
//		session.getTransaction().commit();
//		getSessionByID(session);
//		getAllData(session);
//		getNativeSqlData(session);
//		getAllNamedQueryByName(session);
		getAllNamedQueryByName(session);
		HibernateUtil.closeSession(session);
	}

	public static void getSessionByID(Session session) {
		Doctor doctor = session.get(Doctor.class, 1L);
		System.out.println(doctor);
		System.out.println(doctor.getPatient().getId());
		System.out.println(doctor.getPatient().getPatientName());
		System.out.println(doctor.getPatient().getMobileNumber());
		System.out.println(doctor.getPatient().getHealthIssue());

	}

	public static void getAllData(Session session) {
		List<Doctor> allData = session.createQuery("from Doctor").list();
		allData.forEach(System.out::println);
	}

	public static void getNativeSqlData(Session session) {
		List<Object[]> allData = session.createNativeQuery("select * from doctor").list();
//		List<Doctor> doctors= new ArrayList<Doctor>();
//		allData.forEach(System.out::println);
//		doctors.addAll(allData);

		for (Object[] objects : allData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}

	}

	public static void getAllNamedQuery(Session session) {
		List<Doctor> list = session.createNamedQuery("get.Doctors").list();
		list.forEach(System.out::println);
	}

	public static void getAllNamedQueryByName(Session session) {
		List<Doctor> list = session.createNamedQuery("get.ByName").getResultList();
		list.forEach(System.out::println);
	}
	
	public static void getJoinNamedQueryByName(Session session) {
		List<Doctor> list = session.createNamedQuery("get.joinData").getResultList();
		list.forEach(System.out::println);
	}
}
