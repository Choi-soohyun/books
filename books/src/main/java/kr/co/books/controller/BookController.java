package kr.co.books.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * -----------------------------------------------------------------------------------------------------
 * [BookController]
 * 도서 관련
 * -----------------------------------------------------------------------------------------------------
 * 날짜			이름			내용	 
 * -----------------------------------------------------------------------------------------------------
 * 2020.05.13	shChoi		페이지 이동 수정
 */

@Controller
@RequestMapping("")
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping("/")
	public String list() {
		return "book/list";
	}
	
	@RequestMapping("/add")
	public String bookList() {
		return "book/add";
	}
	
	@RequestMapping("/quotation")
	public String quotation() {
		return "book/quotation";
	}
}
