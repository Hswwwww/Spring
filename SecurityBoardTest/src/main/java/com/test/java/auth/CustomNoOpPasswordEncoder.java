package com.test.java.auth;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomNoOpPasswordEncoder implements PasswordEncoder{
	
	@Override
	public String encode(CharSequence rawPassword) {
		//입력된 값을 암호화로 만듦
		System.out.println("PasswrodEncoder >>> " + rawPassword);
		
		return rawPassword.toString();
	}
	
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// 사용자가 입력한 값이랑 암호화가 같은지 확인
	
		System.out.println("PasswrodEncoder >>> " + rawPassword + ":" + encodedPassword);
		
		return rawPassword.toString().equals(encodedPassword);
		
	}
	
}
