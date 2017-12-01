package com.user1.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.server.model.ServerVO;

import hibernate.util.HibernateUtil;

public class User1DAO {

	public static void main(String[] args) {
		
		List<ServerVO> serverlist = new LinkedList<ServerVO>();
		ServerVO server1 = new ServerVO();
		server1.setServerid(19);
		server1.setAddress("PC-219"); 
		server1.setUsers(new HashSet());
		
		ServerVO server2 = new ServerVO(); 
		server2.setServerid(18);
		server2.setAddress("PC-220"); 
		server2.setUsers(new HashSet());
		
		ServerVO server3 = new ServerVO(); 
		server3.setServerid(20);
		server3.setAddress("PC-221");
		server3.setUsers(new HashSet());
		
		serverlist.add(server1);
		serverlist.add(server2);
		serverlist.add(server3);
		
		System.out.println(serverlist.size());
		
		
		User1VO user1 = new User1VO(); 
		user1.setName("caterpillar");
		user1.setServers(new HashSet());
			
		// 多對多，互相參考
		for(int i=0 ; i<serverlist.size() ; i++){
			user1.getServers().add(serverlist.get(i));
			serverlist.get(i).getUsers().add(user1);
		}
		        	        
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Transaction tx= session.beginTransaction(); 
		session.saveOrUpdate(user1);
		        
		tx.commit();
		session.close();

	}

}
