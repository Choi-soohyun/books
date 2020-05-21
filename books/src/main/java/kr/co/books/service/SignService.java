package kr.co.books.service;

import kr.co.books.vo.SignVO;

public interface SignService {
//	public SignVO login(SignVO vo);
	public int join(SignVO vo);
	public Integer emailCheck(SignVO vo);
	public int authCheck(SignVO vo);
	public int authUpdate(SignVO vo);
}
