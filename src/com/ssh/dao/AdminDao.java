package com.ssh.dao;

import java.util.List;

import com.ssh.model.Admins;

public interface AdminDao {
	
	public void save(Admins a);
	
	public void delete(int id);
	
	public List getAdmins();
	
	public Admins getAdmin(int id);

}
