package kr.co.books.service.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.books.dao.SignDAO;
import kr.co.books.service.SignService;
import kr.co.books.util.CryptUtil;
import kr.co.books.vo.SignVO;

@Service("SignService")
public class SignServiceImpl implements SignService {
	private static final Logger logger = LoggerFactory.getLogger(SignServiceImpl.class);
	
	@Autowired
	private SignDAO signDao;
	
	@Override
	public SignVO login(SignVO vo) {
		CryptUtil decrypt = new CryptUtil();
		SignVO resultVO = signDao.login(vo);
		try {
			String currentPw = vo.getPw();
			String savePw= resultVO.getPw();
			
			if(!currentPw.equals(decrypt.decryptAES256(savePw))) {
				resultVO = null;
			}
		} catch (Exception e) {
			resultVO = null;
			e.printStackTrace();
		}
		return resultVO;
	}

	@Override
	public int join(SignVO vo) {
		CryptUtil encrypt = new CryptUtil();
		try {
			vo.setPw(encrypt.encryptAES256(vo.getPw()));
			vo.setAuth_key(randomNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return signDao.join(vo);
	}

	@Override
	public Integer emailCheck(SignVO vo) {
		return signDao.emailCheck(vo);
	}

	@Override
	public int authCheck(SignVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int authUpdate(SignVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 숫자 랜덤 6자리 만들기
	 * @return
	 */
	public String randomNumber() {
		String strNumber = "";
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			int iNum = rand.nextInt(10);
			strNumber += Integer.toString(iNum);
		}
		return strNumber;
	}
}
