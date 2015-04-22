package com.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.dao.AdminDao;
import com.ssh.hibernate.HibernateUtil;
import com.ssh.model.Admins;

public class AdminDaoHibernate extends HibernateDaoSupport implements AdminDao {
    /*
     * ɾ��ӿڵ�ʵ��?
     */
	
	 private static final AdminDaoHibernate instance = new AdminDaoHibernate();
	    
	  public static AdminDaoHibernate getInstance() {
	    return instance;
	  }
	    
	  private AdminDaoHibernate() {
	    
	  }
	public void delete(int id) {
		HibernateUtil.delete(logger);
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
		HibernateUtil.save(a);
//		getHibernateTemplate().saveOrUpdate(a);

	}
	//----------------------------------------------------------------------------
}
