package kr.co.books.vo;

import java.util.Date;

public class BookVO {
	private String bookName;
	private String bookImagePath;
	private Date readedDate;
	private String bookTag;
	private String quotation;
	private Integer quotationCount;
	private String user;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookImagePath() {
		return bookImagePath;
	}
	public void setBookImagePath(String bookImagePath) {
		this.bookImagePath = bookImagePath;
	}
	public Date getReadedDate() {
		return readedDate;
	}
	public void setReadedDate(Date readedDate) {
		this.readedDate = readedDate;
	}
	public String getBookTag() {
		return bookTag;
	}
	public void setBookTag(String bookTag) {
		this.bookTag = bookTag;
	}
	public String getQuotation() {
		return quotation;
	}
	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}
	public Integer getQuotationCount() {
		return quotationCount;
	}
	public void setQuotationCount(Integer quotationCount) {
		this.quotationCount = quotationCount;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
