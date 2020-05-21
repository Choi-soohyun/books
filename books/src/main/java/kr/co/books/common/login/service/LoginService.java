package kr.co.books.common.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kr.co.books.common.login.vo.MemberVO;
import kr.co.books.dao.SignDAO;
import kr.co.books.vo.SignVO;

@Service("loginService")
public class LoginService implements UserDetailsService {

	@Autowired
	SignDAO signDAO;
	
//	private PasswordEncoder passwordEncoder = new CryptUtil();
	
	SignVO signVO;
	MemberVO memVO;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		signVO = signDAO.memberInfo(email);
		
		if(signVO == null) {
			throw new UsernameNotFoundException(email);
		}
		
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		auth.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		memVO = new MemberVO(signVO.getEmail(), signVO.getPw(), true, true, true, true, auth, signVO.getMem_id(), signVO.getUser_name());
		
		return memVO;
	}

	public SignVO getMemberInfo() {
		if(signVO != null) {
			return signVO;
		}
		return null;
	}
}
