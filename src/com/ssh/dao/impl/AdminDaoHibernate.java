package com.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.dao.AdminDao;
import com.ssh.model.Admins;

public class AdminDaoHibernate extends HibernateDaoSupport implements AdminDao {
    /*
     * ɾ��ӿڵ�ʵ��?
     */
	public void delete(int id) {
		getHibernateTemplate().delete(getAdmin(id));
	}
	//----------------------------------------------------------------------------
	
	/*
     * ���?id��ȡ����Ա��Ϣ
     */
	public Admins getAdmin(int id) {
		return (Admins) getHibernateTemplate().get(com.ssh.model.Admins.class, id);
	}
	//----------------------------------------------------------------------------
	
	/*
     * ��ȡ���й���Ա�б�
     */
	public List getAdmins() {
		return getHibernateTemplate().find("from admins order by id desc");
	}
	//----------------------------------------------------------------------------
	
	/*
     * ����ӿڵ�ʵ��?
     */
	public void save(Admins a) {
		System.out.println("in hibernate class metod = save");
		getHibernateTemplate().saveOrUpdate(a);

	}
	//----------------------------------------------------------------------------
}
