package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/ex05.do")
@RequestMapping("/board")
public class Ex05Controller {
	
//	@RequestMapping
//	public String tex05() {
//		
//		return "ex05";
//	}
	
	//Ambiguous mapping, Cannot map 'ex05Controller' method
//	@RequestMapping
//	public String test() {
//		
//		return "ex04";
//	}


	@RequestMapping(value="/ex05.do")
	public String ex05() {
		return "ex05";
	}
	
	@RequestMapping(value="/test.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String text() {
		return "ex05";
	}
	
//	@RequestMapping(value="/add.do", method=RequestMethod.GET)
//	public String add() {
//		return "add";
//	}
//	
//	@RequestMapping(value="/addok.do",method=RequestMethod.POST)
//	public String addok() {
//		return "addok";
//	}
	
	
//	@RequestMapping(value="/add.do", method=RequestMethod.GET)
//	public String add() {
//		return "add";
//	}
//	
//	@RequestMapping(value="/addok.do",method=RequestMethod.POST)
//	public String addok() {
//		return "addok";
//	}

	//스프링 4.3이후 만들어진 어노테이션
	@GetMapping("/add.do")
	public String add() {
		return "add";
		
	}
	
	@PostMapping("/addok.do")
	public String addok() {
		return "addok";
	}
	
}
