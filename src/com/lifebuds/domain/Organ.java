package com.lifebuds.domain;

public class Organ {

	private int organ_id;
	private int organ_kidney;
	private int organ_cornea;
	private int organ_lungs;
	private int organ_blood;
	private int organ_pancreas;
	private int organ_heart;
	private int organ_liver;
	private int organ_small_bowel;
	private int organ_tissue;
	private Donor organ_user_id;
	public Organ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organ(int organ_id, int organ_kidney, int organ_cornea, int organ_lungs, int organ_blood,
			int organ_pancreas, int organ_heart, int organ_liver, int organ_small_bowel, int organ_tissue,
			Donor organ_user_id) {
		super();
		this.organ_id = organ_id;
		this.organ_kidney = organ_kidney;
		this.organ_cornea = organ_cornea;
		this.organ_lungs = organ_lungs;
		this.organ_blood = organ_blood;
		this.organ_pancreas = organ_pancreas;
		this.organ_heart = organ_heart;
		this.organ_liver = organ_liver;
		this.organ_small_bowel = organ_small_bowel;
		this.organ_tissue = organ_tissue;
		this.organ_user_id = organ_user_id;
	}
	public int getOrgan_id() {
		return organ_id;
	}
	public void setOrgan_id(int organ_id) {
		this.organ_id = organ_id;
	}
	public int getOrgan_kidney() {
		return organ_kidney;
	}
	public void setOrgan_kidney(int organ_kidney) {
		this.organ_kidney = organ_kidney;
	}
	public int getOrgan_cornea() {
		return organ_cornea;
	}
	public void setOrgan_cornea(int organ_cornea) {
		this.organ_cornea = organ_cornea;
	}
	public int getOrgan_lungs() {
		return organ_lungs;
	}
	public void setOrgan_lungs(int organ_lungs) {
		this.organ_lungs = organ_lungs;
	}
	public int getOrgan_blood() {
		return organ_blood;
	}
	public void setOrgan_blood(int organ_blood) {
		this.organ_blood = organ_blood;
	}
	public int getOrgan_pancreas() {
		return organ_pancreas;
	}
	public void setOrgan_pancreas(int organ_pancreas) {
		this.organ_pancreas = organ_pancreas;
	}
	public int getOrgan_heart() {
		return organ_heart;
	}
	public void setOrgan_heart(int organ_heart) {
		this.organ_heart = organ_heart;
	}
	public int getOrgan_liver() {
		return organ_liver;
	}
	public void setOrgan_liver(int organ_liver) {
		this.organ_liver = organ_liver;
	}
	public int getOrgan_small_bowel() {
		return organ_small_bowel;
	}
	public void setOrgan_small_bowel(int organ_small_bowel) {
		this.organ_small_bowel = organ_small_bowel;
	}
	public int getOrgan_tissue() {
		return organ_tissue;
	}
	public void setOrgan_tissue(int organ_tissue) {
		this.organ_tissue = organ_tissue;
	}
	public Donor getOrgan_user_id() {
		return organ_user_id;
	}
	public void setOrgan_user_id(Donor organ_user_id) {
		this.organ_user_id = organ_user_id;
	}
	@Override
	public String toString() {
		return "Organ [organ_id=" + organ_id + ", organ_kidney=" + organ_kidney + ", organ_cornea=" + organ_cornea
				+ ", organ_lungs=" + organ_lungs + ", organ_blood=" + organ_blood + ", organ_pancreas="
				+ organ_pancreas + ", organ_heart=" + organ_heart + ", organ_liver=" + organ_liver
				+ ", organ_small_bowel=" + organ_small_bowel + ", organ_tissue=" + organ_tissue + ", organ_user_id="
				+ organ_user_id + "]";
	}
	
	
	
	
}
