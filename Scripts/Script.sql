--SELECT JOBALL
SELECT JOB_ID ,JOB_TITLE ,MIN_SALARY ,MAX_SALARY 
	FROM JOBS;
	
--INSERT 
INSERT INTO GD.JOBS
(JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY)
VALUES('', '', 0, 0);

--DELETE 
DELETE FROM JOBS j
	WHERE JOB_ID = 'IT_PROG';

--UPDATE
UPDATE JOBS SET JOB_ID = 'IT',JOB_TITLE ='DEVELOPER'
	WHERE LOWER(JOB_ID) = LOWER('IT_PROG') AND UPPER(JOB_TITLE)  =UPPER('PROGRAMER')  
	
	
--INFO 테이블 SEQ(SEQUIENCE:INFO_SEQ),AUTH(DEFUALT CONSTRAINT)

	SELECT *
		FROM INFO i ;
	
	INSERT INTO INFO(SEQ,NAME,PHONE,REGDATE)
		VALUES (INFO_SEQ.NEXTVAL,'시계','111',SYSDATE);
		
	SELECT SEQ,NAME,PHONE,AUTH ,REGDATE
		FROM INFO INFO 
			WHERE SEQ = 21;
			
--LIKE문 사용
--%지시자 이기 떄문에 PreparedStatement에서 문법인식하지 않음	
-concatenation을 통해서 값과 문법을 분리	
	SELECT *
		FROM JOBS j 
			WHERE JOB_ID LIKE 'IT%';
		SELECT *
		FROM JOBS j 
			WHERE JOB_ID LIKE 'IT'||'%';
			
		
----------------Dynamic 쿼리 ---------------
--1) 조건문을 판단해서 값이 있다면 상세검색, 값이 없다면 전체검색 IF
		SELECT JOB_ID ,JOB_TITLE ,MIN_SALARY ,MAX_SALARY 
			FROM JOBS j 
				WHERE JOB_ID ='IT_PROG'
				

				
CREATE TABLE PROJECT(
   U_ID NUMBER PRIMARY KEY,
   U_NAME VARCHAR(50),
   U_ADDRESS VARCHAR(50));
	
 INSERT INTO PROJECT(U_ID, U_NAME, U_ADDRESS)
 	VALUES (1, '김모', 'add');
 INSERT INTO PROJECT(U_ID, U_NAME, U_ADDRESS)
 	VALUES (2, '송모', 'min');
 INSERT INTO PROJECT(U_ID, U_NAME, U_ADDRESS)
 	VALUES (3, '정모', 'jin');
  
  
 SELECT *	
 	FROM PROJECT ;
  
  
  
  
  
  
  
  
  
  
  
  