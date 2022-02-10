package com.min.edu.model;

import com.min.edu.vo.InfoVo;

/**
 * 각각의 기능을 가지고 있는 interface
 * insert/ delete
 * @author longd
 *
 */
public interface IInfoSelectkeyDao {
	
	/**
	 * info테이블에 name와 phone을 입력하는 기능
	 * @param vo String name, String phone
	 * @return 성공한 row 갯수
	 */
	public int insertInfo(InfoVo vo);
	
	/**
	 * info 테이블에서 insert
	 * @param vo
	 * @return
	 */
	public InfoVo selectOneInfo(InfoVo vo);

}
