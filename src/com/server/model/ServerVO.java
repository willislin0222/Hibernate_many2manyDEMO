package com.server.model;

import java.util.Set;

import com.user1.model.User1VO;

public class ServerVO {

	private Integer serverid;
	private String address;
	private Set<User1VO> users;
	public Integer getServerid() {
		return serverid;
	}
	public void setServerid(Integer serverid) {
		this.serverid = serverid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<User1VO> getUsers() {
		return users;
	}
	public void setUsers(Set<User1VO> users) {
		this.users = users;
	}
	
	
}
