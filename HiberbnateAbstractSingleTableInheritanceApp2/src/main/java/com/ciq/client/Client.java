package com.ciq.client;

import org.hibernate.Session;

import com.ciq.acc.util.HibernateUtil;
import com.ciq.model.CricketPlayer;
import com.ciq.model.FootBallPlayer;
import com.ciq.model.Player;

public class Client {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
//		Player player = new Player("bolt", "atheletic");
		CricketPlayer ck = new CricketPlayer("virat", "slim", "India", "Batsman");
		FootBallPlayer footBallPlayer = new FootBallPlayer("ronoldo", "Musclur", 1200, "Portugal");
		session.getTransaction().begin();
//		session.persist(player);
		session.persist(ck);
		session.persist(footBallPlayer);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
	}

}
