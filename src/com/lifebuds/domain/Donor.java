package com.lifebuds.domain;

public class Donor {

	private int donor_id;
	private String donor_fname;
	private String donor_lname;
	private String donor_age;
	private String donor_address;
	private String donor_phone;
	private String donor_gender;
	private String donor_email;
	private String donor_password;
	private String donor_bloodgroup;
	private int donor_role;
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donor(int donor_id, String donor_fname, String donor_lname,
			String donor_age, String donor_address, String donor_phone,
			String donor_gender, String donor_email, String donor_password,
			String donor_bloodgroup, int donor_role) {
		super();
		this.donor_id = donor_id;
		this.donor_fname = donor_fname;
		this.donor_lname = donor_lname;
		this.donor_age = donor_age;
		this.donor_address = donor_address;
		this.donor_phone = donor_phone;
		this.donor_gender = donor_gender;
		this.donor_email = donor_email;
		this.donor_password = donor_password;
		this.donor_bloodgroup = donor_bloodgroup;
		this.donor_role = donor_role;
	}
	public int getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}
	public String getDonor_fname() {
		return donor_fname;
	}
	public void setDonor_fname(String donor_fname) {
		this.donor_fname = donor_fname;
	}
	public String getDonor_lname() {
		return donor_lname;
	}
	public void setDonor_lname(String donor_lname) {
		this.donor_lname = donor_lname;
	}
	public String getDonor_age() {
		return donor_age;
	}
	public void setDonor_age(String string) {
		this.donor_age = string;
	}
	public String getDonor_address() {
		return donor_address;
	}
	public void setDonor_address(String donor_address) {
		this.donor_address = donor_address;
	}
	public String getDonor_phone() {
		return donor_phone;
	}
	public void setDonor_phone(String donor_phone) {
		this.donor_phone = donor_phone;
	}
	public String getDonor_gender() {
		return donor_gender;
	}
	public void setDonor_gender(String donor_gender) {
		this.donor_gender = donor_gender;
	}
	public String getDonor_email() {
		return donor_email;
	}
	public void setDonor_email(String donor_email) {
		this.donor_email = donor_email;
	}
	public String getDonor_password() {
		return donor_password;
	}
	public void setDonor_password(String donor_password) {
		this.donor_password = donor_password;
	}
	public String getDonor_bloodgroup() {
		return donor_bloodgroup;
	}
	public void setDonor_bloodgroup(String donor_bloodgroup) {
		this.donor_bloodgroup = donor_bloodgroup;
	}
	public int getDonor_role() {
		return donor_role;
	}
	public void setDonor_role(int donor_role) {
		this.donor_role = donor_role;
	}
	@Override
	public String toString() {
		return "Donor [donor_id=" + donor_id + ", donor_fname=" + donor_fname
				+ ", donor_lname=" + donor_lname + ", donor_age=" + donor_age
				+ ", donor_address=" + donor_address + ", donor_phone="
				+ donor_phone + ", donor_gender=" + donor_gender
				+ ", donor_email=" + donor_email + ", donor_password="
				+ donor_password + ", donor_bloodgroup=" + donor_bloodgroup
				+ ", donor_role=" + donor_role + "]";
	}
	
	
}

