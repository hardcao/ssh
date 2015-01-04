package com.ssh.service.impl;

import java.util.List;

import com.ssh.dao.AdminDao;
import com.ssh.dao.impl.AdminDaoHibernate;
import com.ssh.model.Admins;
import com.ssh.service.AdminManager;

public class AdminManagerImpl implements AdminManager {
	private AdminDao dao;
	

	public void setAdminDao(AdminDao dao) {
		this.dao = dao;
	}

	public void save(Admins a) {
		System.out.println("in serviceImpl class metod = save");
		dao.save(a);

	}

	public void delete(int id) {
		dao.delete(id);

	}

	public Admins getAdmin(int id) {
		return dao.getAdmin(id);
	}

	public List getAdmins() {
		return dao.getAdmins();
	}

}
