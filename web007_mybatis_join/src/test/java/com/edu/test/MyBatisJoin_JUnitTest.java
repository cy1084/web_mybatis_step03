package com.edu.test;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.min.edu.comm.SqlSessionFactoryCreate;

public class MyBatisJoin_JUnitTest {


	@Test
	public void test() {
		SqlSessionFactory factory=SqlSessionFactoryCreate.getFactory();
		SqlSession session= factory.openSession();
		assertNotNull(session);
	}

}
