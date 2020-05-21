package kr.co.books.common.login.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.books.common.login.vo.MemberVO;
import kr.co.books.util.MybatisLogUtil;

@Repository("loginDao")
public class LoginDAO {
	private static final Logger logger = LoggerFactory.getLogger(LoginDAO.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	@Resource(name = "mybatisLog")
	private MybatisLogUtil mybatisLog;
	
	public void setSqlSessionTemplate(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
