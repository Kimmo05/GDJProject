package com.min.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.min.edu.model.IJobsSelectDao;
import com.min.edu.model.IProductsDao;
import com.min.edu.model.JobsSelectDaoImpl;
import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.MyBatisVo;
import com.min.edu.vo.ProductsVo;
import com.min.edu.vo.TestVo;

/*
 * assert명령어는 완성된 객체를 테스트하기 위한 메소드
 * assertArrayEquals(a,b)
 * assertNotNull(a)
 * assertTrue(a)
 * Annotation
 * @Test 테스트가 수행되는 메소드 
 * @Before 다른 테스트가 수행되기 전에 실행되는 메소드 
 * @
 */
public class MyBatis_JunitTest {

	SqlSession session;
	IJobsSelectDao dao = new JobsSelectDaoImpl();
	
	@Before
	public void createSession() {

		SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
		//sql세선 만듬 
		session = manager.openSession();// transaction이 자동으로 처리됨 default(false)
		assertNotNull(session);
	}
//	@Test
	public void selectJobsAll() {
		List<MyBatisVo> jobsAll = session.selectList("com.min.edu.jobs.selectJobsAll");
		System.out.println(jobsAll);
		assertNotNull(jobsAll);
	}
//	@Test
	public void select01() {
		int n = dao.select01("IT_PROG");
		System.out.println("IT_PROG의 결과"+n);
		assertNotNull(n);
	}
//	@Test
	public void select02() {
		MyBatisVo vo = dao.select02("IT_PROG");
		System.out.println("IT_PROG정보 :" +vo);
		assertNotNull(vo);
	}
//	@Test
	public void select03() {
		String str = "IT_PROG";
		Object obj = str;
		MyBatisVo vo = dao.select03(obj);
		assertNotNull(vo);
	}
	
//	@Test
	public void selectAll() {
		List<TestVo> all = session.selectList("com.min.edu.model.TestDaoImpl.selectAll");
		System.out.println(all);
		assertNotNull(all);
	}
	

	   

	   
}
