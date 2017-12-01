package com.user1.model;

import java.util.Set;

import com.server.model.ServerVO;

public class User1VO {

	private Integer userid;
	private String name;
	private Set<ServerVO> servers;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ServerVO> getServers() {
		return servers;
	}
	public void setServers(Set<ServerVO> servers) {
		this.servers = servers;
	}
	
	
	
}
