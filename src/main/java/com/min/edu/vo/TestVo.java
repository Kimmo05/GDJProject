package com.min.edu.vo;

public class TestVo {

	private int U_ID;
	private String U_NAME;
	private String U_ADDRESS;
	
	public TestVo() {
		
	}
	
	public TestVo(int u_ID, String u_NAME, String u_ADDRESS) {
		super();
		U_ID = u_ID;
		U_NAME = u_NAME;
		U_ADDRESS = u_ADDRESS;
	}

	public int getU_ID() {
		return U_ID;
	}

	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}

	public String getU_NAME() {
		return U_NAME;
	}

	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}

	public String getU_ADDRESS() {
		return U_ADDRESS;
	}

	public void setU_ADDRESS(String u_ADDRESS) {
		U_ADDRESS = u_ADDRESS;
	}

	@Override
	public String toString() {
		return "TestVo [U_ID=" + U_ID + ", U_NAME=" + U_NAME + ", U_ADDRESS=" + U_ADDRESS + "]";
	}
	
	
	
	
}
