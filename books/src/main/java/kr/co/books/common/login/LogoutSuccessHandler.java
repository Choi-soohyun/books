package kr.co.books.common.login;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
	private static final Logger logger = LoggerFactory.getLogger(LogoutSuccessHandler.class);
	
	public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse res, Authentication auth) throws IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		
		res.sendRedirect("/sign/signin");
	}
}
