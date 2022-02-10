package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.MyBatisVo;

public class JobsSelectDaoImpl implements IJobsSelectDao {
//1) 사용자 로그
	private Logger log = Logger.getLogger(this.getClass());
//2) SqlSessionFactory 
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
//3) 클래스에서 호출하게 NameSpace를 변수 선언
	private final String NS ="com.min.edu.model.JobsSelectDaoImpl.";
	@Override
	public Integer select01(String id) {
		log.info("Primitive를 사용한 Parameter 전달과 결과 값 받기");
		 SqlSession session =	manager.openSession();// defualt false Transaction이 동작되는 환경
			int n = session.selectOne(NS+"select01",id);
			return n;
	}
	@Override
	public MyBatisVo select02(String id) {
		log.info("Primitive를 사용하여 Parameter를 전달 결과는 VO로 반환한다.\n"
				+"Mybatis 절되는 Parameter를 Object처리가 되기때문에 작성하지 않아도된다. ");
			SqlSession session = manager.openSession();
			return session.selectOne(NS+"select02",id);
	}
	@Override
	public MyBatisVo select03(Object job_id) {
		log.info("Object로 parameter를 전달 , 결과의 column명이 다른 경우 resultMap");
		SqlSession session = manager.openSession();
		MyBatisVo vo = session.selectOne(NS+"select03",job_id);
		return vo;
	}

}
