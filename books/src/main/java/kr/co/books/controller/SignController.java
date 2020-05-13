package kr.co.books.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * -----------------------------------------------------------------------------------------------------
 * [SignController]
 * 회원가입 관련
 * -----------------------------------------------------------------------------------------------------
 * 날짜			이름			내용	 
 * -----------------------------------------------------------------------------------------------------
 * 2020.05.13	shChoi		페이지 이동 추가
 */

@Controller
@RequestMapping("/sign")
public class SignController {

	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	
	@RequestMapping("/signin")
	public String signin() {
		return "sign/signin";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "sign/signup";
	}
	
	@RequestMapping("/auth")
	public String quotation() {
		return "sign/auth";
	}
}
