package com.user1.model;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.server.model.ServerVO;

import hibernate.util.HibernateUtil;

public class User1DAO {

	public static void main(String[] args) {
		
		ServerVO server1 = new ServerVO();
		server1.setAddress("PC-219"); 
		server1.setUsers(new HashSet());
		
		ServerVO server2 = new ServerVO(); 
		server2.setAddress("PC-220"); 
		server2.setUsers(new HashSet());
		
		ServerVO server3 = new ServerVO(); 
		server3.setAddress("PC-221");
		server3.setUsers(new HashSet());
		
		User1VO user1 = new User1VO(); 
		user1.setName("caterpillar");
		user1.setServers(new HashSet());
		
		User1VO user2 = new User1VO(); 
		user2.setName("momor");
		user2.setServers(new HashSet());
		
		// 多對多，互相參考
		user1.getServers().add(server1); 
		user1.getServers().add(server2); 
		user1.getServers().add(server3); 
		server1.getUsers().add(user1); 
		server2.getUsers().add(user1); 
		server3.getUsers().add(user1); 
		        
		user2.getServers().add(server1); 
		user2.getServers().add(server3); 
		server1.getUsers().add(user2); 
		server3.getUsers().add(user2); 
		        
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Transaction tx= session.beginTransaction(); 
		session.save(user1); 
		session.save(user2); 
		        
		tx.commit();
		session.close();

	}

}
