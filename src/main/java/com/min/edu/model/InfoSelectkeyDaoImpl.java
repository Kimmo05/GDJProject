package com.min.edu.model;

import org.apache.catalina.Manager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.InfoVo;

public class InfoSelectkeyDaoImpl implements IInfoSelectkeyDao{

	private Logger logger = Logger.getLogger(getClass());
	private final String NS = "com.min.edu.model.InfoSelectkeyDaoImpl.";
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	@Override
	public int insertInfo(InfoVo vo) {
		logger.info("insertInfo 처음 입력받은 VO의 seq값"+vo.getSeq());
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertInfo",vo);
		logger.info("insertInfo 쿼리에서 selectkey에 의해 변경된 VO의 seq값"+vo.getSeq());
		return row;
	}

	@Override
	public InfoVo selectOneInfo(InfoVo vo) {
		logger.info("selectOneInfo 방금입력된 SEQ값 :" +vo.getSeq());
		SqlSession session = manager.openSession();
		return session.selectOne(NS+"selectOneInfo",vo);
	}

}
