package com.min.edu.model;

import com.min.edu.vo.InfoVo;

/**
 * 여러개의 DAO를 조합해서 처리는 interface
 * info 입력(insert/select)
 * @author longd
 *
 */
public interface IInfoService {
	/**
	 * 두개의 동작인 insert와 select를 묶어서 실행 시켜주는 메소드
	 * @param vo 전달값 그리고 selectkey에 대상이 되는 setSeq() 가지고 있는 객체
	 * @return 입력한 row의 select된 결과
	 */
	public InfoVo afterInsert(InfoVo vo);
}
