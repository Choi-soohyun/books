package kr.co.books.common.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import kr.co.books.common.login.service.LoginService;
import kr.co.books.vo.SignVO;

public class LoginFailureHandler implements AuthenticationFailureHandler {
	private static final Logger logger = LoggerFactory.getLogger(LoginFailureHandler.class);
	
	@Autowired
	private LoginService loginService;
	
	public LoginFailureHandler(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res, AuthenticationException auth)
			throws IOException, ServletException {
		SignVO vo = loginService.getMemberInfo();
		String errorCode = "";
		
		if(vo == null) {
			errorCode = "1";
		} else {
			errorCode = "2";
		}

		req.setAttribute("email", req.getParameter("email"));
		req.getRequestDispatcher("/sign/signin?error="+errorCode).forward(req, res);
	}
}
