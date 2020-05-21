package kr.co.books.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.books.service.SignService;
import kr.co.books.util.AJaxResVO;
import kr.co.books.util.CryptUtil;
import kr.co.books.vo.SignVO;

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
@SessionAttributes({"memberVO"})
@RequestMapping("/sign")
public class SignController {
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);

	@Autowired
	private SignService signService;
	
	@RequestMapping("/signin")
	public String signin() {
		return "sign/signin";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "sign/signup";
	}
	
	@RequestMapping("/auth")
	public String auth() {
		return "sign/auth";
	}
	
	/***
	 * 로그인 -> Spring Security로 변경 
	 * @param model
	 * @param vo
	 * @return
	 */
//	@RequestMapping("/login")
//	public @ResponseBody AJaxResVO login(Model model, SignVO vo) {
//		AJaxResVO jRes = new AJaxResVO();
//		try {
//			SignVO resultVO = signService.login(vo);
//			
//			if(resultVO != null) {
//				jRes.setResult("1");
//				model.addAttribute("memberVO", resultVO);
//			} else {
//				jRes.setResult("2");
//			}
//		} catch (Exception e) {
//			jRes.setSuccess(AJaxResVO.SUCCESS_N);
//			logger.error(jRes.toStringResult());
//			logger.error("", e);
//		}
//		return jRes;
//	}
	
	@RequestMapping("/join")
	public @ResponseBody AJaxResVO join(SignVO vo) {
		AJaxResVO jRes = new AJaxResVO();
		try {
			int result = signService.join(vo);
			
			if(result > 0) {
				jRes.setResult("1");
			} else {
				jRes.setResult("2");
				logger.warn(jRes.toStringResult());
			}
		} catch (Exception e) {
			jRes.setSuccess(AJaxResVO.SUCCESS_N);
			logger.error(jRes.toStringResult());
			logger.error("", e);
		}
		return jRes;
	}
	
	@RequestMapping("/emailCheck")
	public @ResponseBody AJaxResVO emailCheck(SignVO vo) {
		AJaxResVO jRes = new AJaxResVO();
		try {
			Integer result = signService.emailCheck(vo);
			
			if(result == null) {
				jRes.setResult("1");
			} else {
				jRes.setResult("2");
			}
		} catch (Exception e) {
			jRes.setSuccess(AJaxResVO.SUCCESS_N);
			logger.error(jRes.toStringResult());
			logger.error("", e);
		}
		return jRes;
	}
}
