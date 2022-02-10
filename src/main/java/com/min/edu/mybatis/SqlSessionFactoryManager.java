package com.min.edu.mybatis;
/*
 * 환경설정 파일인 SqlMapConfig.xml 파일을(+Mapper) 읽어서
 * Java 객체인 SqlSessionFactory 객체를 만들어줌
 * 입력해야된 값(설정)이 많기 떄문에 xml을 통해서 작성한 후 IO를 통해서 읽어 낸다..
 * 웹시스템 CRUD가 기본이기 때문에 static 생성자를 통해서 실행
 */
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//Configuration 부분 
public class SqlSessionFactoryManager {

	private static SqlSessionFactory factory;
	
	public static  SqlSessionFactory getFactory() {
		return factory;
	}
	
	static {
		//사용할 xml의 위치를 => IO읽는 메소드를 사용한 Resource
		String path = "com/min/edu/mybatis/SqlMapConfig.xml";
		//static 영역에서 작성하는 static 생성자기 때문에 throw를 못함
		try {
			//path에 있는 파일을 읽어오겠다
		 Reader reader=	Resources.getResourceAsReader(path);
		 factory = new SqlSessionFactoryBuilder().build(reader);
		 System.out.println("SqlSessionFactory 객체 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
