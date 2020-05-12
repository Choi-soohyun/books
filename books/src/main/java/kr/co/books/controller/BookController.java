package kr.co.books.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * -----------------------------------------------------------------------------------------------------
 * 
 * -----------------------------------------------------------------------------------------------------
 * 날짜			이름			내용	 
 * -----------------------------------------------------------------------------------------------------
 * 
 */

@Controller
@RequestMapping("")
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping("/")
	public String list() {
		return "book/bookList";
	}
	
	@RequestMapping("/book")
	public String bookList() {
		return "book/bookList";
	}
	
	@RequestMapping("/quotation")
	public String quotation() {
		return "book/quotation";
	}
}
