package com.ciq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ciq.acc.util.HibernateUtil;
import com.ciq.model.CricketPlayer;
import com.ciq.model.FootBallPlayer;
import com.ciq.model.Player;

public class Client {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
//		Player player = new Player("bolt", "atheletic");
//		CricketPlayer ck = new CricketPlayer("virat", "slim", "India", "Batsman");
//		FootBallPlayer footBallPlayer = new FootBallPlayer("ronoldo", "Musclur", 1200, "Portugal");
		session.getTransaction().begin();
//		session.persist(player);
//		session.persist(ck);
//		session.persist(footBallPlayer);
//		Player player = session.get(Player.class, 3l);
//		FootBallPlayer footBallPlayer = (FootBallPlayer) player;
//		System.out.println(footBallPlayer);
//		CricketPlayer cricketPlayer=(CricketPlayer) player;
//		System.out.println(cricketPlayer);
//		System.out.println(player);
//		session.getTransaction().commit();

		List<Player> list = session.createQuery("from Player").list();
		for (Player player : list) {
			System.out.println(player);
		}
		HibernateUtil.closeSession(session);
	}

}
