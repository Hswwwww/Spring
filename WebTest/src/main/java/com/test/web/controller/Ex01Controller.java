package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//JSP Model2(MVC 패턴)
//- Controller > 클라이언트 요청 + 흐름 통제 > java 서블릿
//- View > 반환할 뷰 페이지 작성 > JSP 페이지
//- Model > 데이터 처리 + 이동


//이전 수업 > Servlet 역할
// - Controller > 일반 Java 클래스
// - view > JSP 페이지
// - Model > 동일


public class Ex01Controller implements Controller {

	//handelRequest == doGet/doPost 역할
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		//업무 코드 작성 
		
		//뷰 호출하기
		//- request.getRequestDispatcher("hello.jsp").forward(req,resp); > 이전방식
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex01");
		
		return mv;
	
	}
	
	
	
	
	
	
	
}



