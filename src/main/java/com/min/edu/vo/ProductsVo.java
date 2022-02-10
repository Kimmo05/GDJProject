package com.min.edu.vo;

public class ProductsVo {
	private int p_no;
	private String p_name;
	private int p_price;
	private String p_content;
	private int p_stock;
	private int p_category;
	
	public ProductsVo() {

	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_content() {
		return p_content;
	}

	public void setP_content(String p_content) {
		this.p_content = p_content;
	}

	public int getP_stock() {
		return p_stock;
	}

	public void setP_stock(int p_stock) {
		this.p_stock = p_stock;
	}

	public int getP_category() {
		return p_category;
	}

	public void setP_category(int p_category) {
		this.p_category = p_category;
	}

	public ProductsVo(int p_no, String p_name, int p_price, String p_content, int p_stock, int p_category) {
		super();
		this.p_no = p_no;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_content = p_content;
		this.p_stock = p_stock;
		this.p_category = p_category;
	}

	@Override
	public String toString() {
		return "ProductsVo [p_no=" + p_no + ", p_name=" + p_name + ", p_price=" + p_price + ", p_content=" + p_content
				+ ", p_stock=" + p_stock + "]\n";
	}


	
	
}
