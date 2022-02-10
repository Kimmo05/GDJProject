package com.min.edu.model;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.MyBatisVo;

public class JobsIDUDaoImpl implements IJobsIDUDao  {
	 private Logger logger = Logger.getLogger(JobsIDUDaoImpl.class);
	   private final String NS = "com.min.edu.model.JobsIDUDaoImpl.";
	   private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();

	@Override
	public Integer insert01(MyBatisVo vo) {
		 SqlSession session= manager.openSession(true); //false로 했을 경우는 manual commit;
	      int row = session.insert(NS+"insert01",vo);
//	      session.commit(); //openSession을 false로 만들었따면 작성해야됨
	      return row;

	}

	@Override
	public Integer delete01(Map<String, Object> map) {
		logger.info("삭제 실행");
		 SqlSession session= manager.openSession(true);
		 //Map을 Parameter로 사용할떄는 key를 정확하게 입력
		 int row = session.delete(NS+"delete01",map);
		return row;
	}

	@Override
	public Integer update01(Map<String, Object> map) {
		logger.info("수정 map을 통한 값 전달");
		 SqlSession session= manager.openSession(true);
		 int row = session.update(NS+"update01",map);
		 return row;
	}

}
