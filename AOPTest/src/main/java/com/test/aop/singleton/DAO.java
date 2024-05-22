package com.test.aop.singleton;

//객체 단 1개만 구현 > 싱글톤 패턴
public class DAO {
	
	private static DAO obj;
	
	private DAO() {} // DAO dao1 =  new DAO()를 막기위함
	
	
	//프로세스
	// - 운영체제가 1개의 프로그램을 실행하는 단위
	
	
	//쓰레드(Thread) 안정성
	// - synchronized: 임계 영역 생성하는 키워드 > 내가 쓰고 있을 동안 lock이 걸리는 현상
	
	public static synchronized DAO getInstance() {
		if(obj==null) {
			obj= new DAO();
		}
		
		return obj;
	}
	
}
