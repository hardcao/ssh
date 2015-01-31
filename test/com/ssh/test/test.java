package com.ssh.test;

import com.ssh.memcached.MemcachedClient;
import com.ssh.memcached.SockIOPool;
import com.ssh.memcached.test.UnitTests;

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
}
