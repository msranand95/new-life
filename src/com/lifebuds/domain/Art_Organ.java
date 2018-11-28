package com.lifebuds.domain;

public class Art_Organ {

	private int shop_id;
	private String shop_name;
	private String shop_place;
	private String shop_contact;
	private String shop_address;
	private String shop_desc;
	public Art_Organ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Art_Organ(int shop_id, String shop_name, String shop_place,
			String shop_contact, String shop_address, String shop_desc) {
		super();
		this.shop_id = shop_id;
		this.shop_name = shop_name;
		this.shop_place = shop_place;
		this.shop_contact = shop_contact;
		this.shop_address = shop_address;
		this.shop_desc = shop_desc;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_place() {
		return shop_place;
	}
	public void setShop_place(String shop_place) {
		this.shop_place = shop_place;
	}
	public String getShop_contact() {
		return shop_contact;
	}
	public void setShop_contact(String shop_contact) {
		this.shop_contact = shop_contact;
	}
	public String getShop_address() {
		return shop_address;
	}
	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}
	public String getShop_desc() {
		return shop_desc;
	}
	public void setShop_desc(String shop_desc) {
		this.shop_desc = shop_desc;
	}
	@Override
	public String toString() {
		return "Art_Organ [shop_id=" + shop_id + ", shop_name=" + shop_name
				+ ", shop_place=" + shop_place + ", shop_contact="
				+ shop_contact + ", shop_address=" + shop_address
				+ ", shop_desc=" + shop_desc + "]";
	}
	
	
}
