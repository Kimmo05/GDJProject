package com.min.edu.vo;

public class InfoVo {


	private int seq;
	private String name;
	private String phone;
	private String auth;
	private String regDate;
	
	public  InfoVo() {
	}

	public InfoVo(String name, String phone) {
		
		this.name = name;
		this.phone = phone;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "InfoVo [seq=" + seq + ", name=" + name + ", phone=" + phone + ", auth=" + auth + ", regDate=" + regDate
				+ "]";
	}
		
	
	
}
