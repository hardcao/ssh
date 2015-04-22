package com.ssh.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ssh.dao.impl.AdminDaoHibernate;
import com.ssh.dao.impl.ProblemContentDaoImpl;
import com.ssh.dao.impl.UserInfoDaoImpl;
import com.ssh.hibernate.HibernateUtil;
import com.ssh.memcached.MemcachedClient;
import com.ssh.memcached.SockIOPool;
import com.ssh.memcached.test.UnitTests;
import com.ssh.model.Admins;
import com.ssh.model.ProblemComment;
import com.ssh.model.ProblemContent;
import com.ssh.model.UserInfo;

import junit.framework.TestCase;

public class test extends TestCase {
	public void test() {
		if ( !UnitTests.class.desiredAssertionStatus() ) {
			System.err.println( "WARNING: assertions are disabled!" );
			try { Thread.sleep( 3000 ); } catch ( InterruptedException e ) {}
		}
		
		String[] serverlist = {
			"127.0.0.1:11211"
		};

		Integer[] weights = { 1, 1, 1, 1, 10, 5, 1, 1, 1, 3 };

		// initialize the pool for memcache servers
		SockIOPool pool = SockIOPool.getInstance( "test2" );
		pool.setServers( serverlist );
		pool.setWeights( weights );
		pool.setMaxConn( 250 );
		pool.setNagle( false );
		pool.setHashingAlg( SockIOPool.CONSISTENT_HASH );
		pool.initialize();
		String test = new String("test1");
		MemcachedClient mc = new MemcachedClient( "test2" );
		mc.set( "foo2", test );
		Object tt = mc.get("foo2");
		System.out.println(tt);
	}
	public void testCreateUser()
	{
		UserInfoDaoImpl.getInstance().createUser("test", "test");
	}
	
	public void testCreateProblem()
	{
		ProblemComment comment = new ProblemComment();
		comment.setCommentContent("test");
		comment.setCommentTime(9);
		comment.setProblemPrompt("test");
		Set<ProblemComment> list = new HashSet<ProblemComment>();
		ProblemContent problem =  ProblemContentDaoImpl.getInstance().createProblem(3,3,4,"test","test","test","test","test");
		list.add(comment);
		problem.setCommentList(list);
		comment.setProblem(problem);
		HibernateUtil.save(comment);
		ProblemContentDaoImpl.getInstance().save(problem);
		
		
	}
}
