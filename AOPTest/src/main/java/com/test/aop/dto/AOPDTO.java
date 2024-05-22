package com.test.aop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AOPDTO {
	
	private String name;
	private String age;
	private String color;
	
}

// 얘는 싱글톤하면 안됌 > 각각의 객체로 있어야 하기 떄문 > 만약 @component하면 앞에 정의됐던 set이 사라짐!