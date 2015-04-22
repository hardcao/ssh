package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.ssh.dao.AdminDao;
import com.ssh.dao.UserInfoDao;
import com.ssh.model.UserInfo;
import com.ssh.hibernate.HibernateUtil;


public class UserInfoDaoImpl implements UserInfoDao {

	public static final int DefaultScore = 0;
	public static final int DefaultStarCount = 0;
	
	 private static final UserInfoDaoImpl instance = new UserInfoDaoImpl();
	    
	  public static UserInfoDaoImpl getInstance() {
	    return instance;
	  }
	    
	  private UserInfoDaoImpl() {
	    
	  } 
	public boolean createUser(String userName, String password) {
		// TODO Auto-generated method stub
		if(!isHasUser(userName)) {
			return false;
		}
		UserInfo  user = getUserInfo(userName, password);
		HibernateUtil.save(user);
		return true;
	}

	public List getUserInfoByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserInfo getUserInfoByUserID(int userID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserInfo getUserInfo(String userName, String password)
	{
		UserInfo  user = new UserInfo();
		user.setPassword(password);
		user.setUserName(userName);
		user.setUserScore(DefaultScore);
		user.setUserStarCount(DefaultStarCount);
		return user;
	}
	
	public boolean isHasUser(String userName)
	{
//		String hql = "from UserInfo where userName =:userName"; 
//        Query query = (Query) HibernateUtil.getSession().createQuery(hql);      
        //第1种方式      
//      query.setString(0, "name1");      
//      query.setString(1, "password1");      
        //第2种方式      
//        query.setString("userName", userName);  
        /*
         * 可以实现跨数据库，因为它是通过方言生成相应的sql语句
         **/
//        query.setFirstResult(0);
//        query.setMaxResults(30);
		Criteria criteria = HibernateUtil.getSession().createCriteria(UserInfo.class);
		criteria.add(Restrictions.eq("userName", userName));
        List<UserInfo> list = criteria.list();   
        System.out.println("test log " +list.size());
        return list.isEmpty(); 
	}
}
