package kr.co.books.dao;

import java.util.List;

import kr.co.books.vo.BookVO;

/*
 * -----------------------------------------------------------------------------------------------------
 * BookDAO
 * -----------------------------------------------------------------------------------------------------
 * 날짜			이름			내용	 
 * -----------------------------------------------------------------------------------------------------
 * 2020.05.07	shChoi		getBookList
 */
public interface BookDAO {
	List<BookVO> getBookList(BookVO vo);
}