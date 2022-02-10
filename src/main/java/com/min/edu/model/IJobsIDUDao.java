package com.min.edu.model;

import java.util.Map;

import com.min.edu.vo.MyBatisVo;

public interface IJobsIDUDao  {


	public Integer insert01(MyBatisVo vo);
	
	public Integer delete01(Map<String,Object> map);
		
	
	public Integer update01(Map<String,Object> map);

	

}
