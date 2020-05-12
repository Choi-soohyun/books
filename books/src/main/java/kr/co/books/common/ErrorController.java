package kr.co.books.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.books.util.AJaxResVO;

/*
 * -----------------------------------------------------------------------------------------------------
 * [CommonController]
 * Error.jsp 페이지 관련
 * 
 * -----------------------------------------------------------------------------------------------------
 * 날짜			이름			내용
 * 2020.02.01	shChoi		Add "Error404" 페이지 
 * -----------------------------------------------------------------------------------------------------
 */

@Controller
@RequestMapping("/common")
public class ErrorController {
	
	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	/**
	 * AjaxError 날 경우 main.jsp에서 이미지만 띄웠다가
	 * 그 이미지 클릭하면 재 로그인 타다가 Controller 안되면 404! 되니깐 그부분 처리하는 것
	 * @return
	 */
	@RequestMapping("/error404")
	public String error404() {
		return "/error/error404";
	}
	
}
