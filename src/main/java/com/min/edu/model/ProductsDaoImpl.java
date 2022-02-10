package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.ProductsVo;

public class ProductsDaoImpl implements IProductsDao {
	private Logger logger = Logger.getLogger(this.getClass());
	private final String NS = "com.min.edu.model.ProductsDaoImpl.";
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();



	@Override
	public List<ProductsVo> selectFood(Object obj) {
		logger.info("식품 카테고리 출력");
		SqlSession session = manager.openSession();
		return session.selectList(NS+"selectFood", obj);
	}
}
