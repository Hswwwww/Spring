package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 컨트롤러 구현
//1. Controller 인터페이스 구현
//2. 어노테이션 사용

@Controller //  얘가 bean으로등록도 해줌!
@RequestMapping(value="/ex04.do")
public class Ex04Controller {
	
	//요청 메서드 > 맘대로 구현!
	@RequestMapping // 이거 붙은 애가 doGet/doPost 역할
	public String test() {
		
		// 업무 코드
		
		
		
		
		return "ex04"; //ModelAndView 처리 동반 + viewReslover 동작
		
	}
	
	
}
