package com.min.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.min.edu.model.IProductsDao;
import com.min.edu.model.ProductsDaoImpl;
import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.ProductsVo;

public class P_JunitTest {

	SqlSession session;
	IProductsDao dao = new ProductsDaoImpl();
	@Before
	public void createSession() {

		SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
		//sql세선 만듬 
		session = manager.openSession();// transaction이 자동으로 처리됨 default(false)
		assertNotNull(session);
	}
	
	   
@Test
public void selectFood() {
	int str = 1;
	List<ProductsVo> vo = dao.selectFood(str);
	System.out.println(vo);
	assertNotNull(vo);
}
}
