package com.min.edu.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.TestVo;

public class TestDaoImpl implements ITestDao {
	
	private Logger logger = Logger.getLogger(this.getClass());
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS = "com.min.edu.model.TestDaoImpl.";

	@Override
	public TestVo selectAll(TestVo test) {
		logger.info("test");
		SqlSession session = manager.openSession();
		List<TestVo> lists = session.selectList(NS+"selectAll", test);
		return (TestVo)lists;
	}


	
}
