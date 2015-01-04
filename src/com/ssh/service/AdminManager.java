package com.ssh.service;

import java.util.List;

import com.ssh.model.Admins;

public interface AdminManager {
	
	public void save(Admins a);
	
	public void delete(int id);
	
	public Admins getAdmin(int id);
	
	public List getAdmins();

}
