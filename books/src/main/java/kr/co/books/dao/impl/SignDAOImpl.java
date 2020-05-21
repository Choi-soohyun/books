package kr.co.books.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.books.dao.SignDAO;
import kr.co.books.util.MybatisLogUtil;
import kr.co.books.vo.SignVO;

@Repository("signDao")
public class SignDAOImpl implements SignDAO {
	private static final Logger logger = LoggerFactory.getLogger(SignDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	@Resource(name = "mybatisLog")
	private MybatisLogUtil mybatisLog;
	
	public void setSqlSessionTemplate(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
//	@Override
//	public SignVO login(SignVO vo) {
//		return sqlSession.selectOne("sign.login", vo);
//	}

	@Override
	public SignVO memberInfo(String str) {
		return sqlSession.selectOne("sign.memberInfo", str);
	}

	@Override
	public int join(SignVO vo) {
		int result = sqlSession.insert("sign.join", vo);
		
		if(result < 1) {
			logger.warn(mybatisLog.getQuery(sqlSession, "sign.join", vo));
		}
		
		return result;
	}

	@Override
	public Integer emailCheck(SignVO vo) {
		return sqlSession.selectOne("sign.emailCheck", vo);
	}

	@Override
	public int authCheck(SignVO vo) {
		return 0;
	}

	@Override
	public int authUpdate(SignVO vo) {
		return 0;
	}

	
}
