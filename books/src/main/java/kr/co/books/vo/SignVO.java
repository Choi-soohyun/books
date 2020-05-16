package kr.co.books.vo;

import java.util.Date;

public class SignVO {
	private Integer mem_id;
	private String user_name;
	private String email;
	private String pw;
	private String auth_key;
	private Date auth_valid_date;
	private Integer auth_flag;
	private Integer valid;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAuth_key() {
		return auth_key;
	}
	public void setAuth_key(String auth_key) {
		this.auth_key = auth_key;
	}
	public Integer getMem_id() {
		return mem_id;
	}
	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}
	public Date getAuth_valid_date() {
		return auth_valid_date;
	}
	public void setAuth_valid_date(Date auth_valid_date) {
		this.auth_valid_date = auth_valid_date;
	}
	public Integer getAuth_flag() {
		return auth_flag;
	}
	public void setAuth_flag(Integer auth_flag) {
		this.auth_flag = auth_flag;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
}