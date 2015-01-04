package com.ssh.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() {
	}
	
	static {
		Configuration hibernateConfiguration = new Configuration();
		hibernateConfiguration.configure();
		sessionFactory = hibernateConfiguration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	public static void update(Object entity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	public static void save(Object entity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	public static void delete(Object entity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}
}
