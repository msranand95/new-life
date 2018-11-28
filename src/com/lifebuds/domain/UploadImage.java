package com.lifebuds.domain;

public class UploadImage {

	private int imageId;
	private String desc;
	private String imagepath;
	
	public UploadImage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UploadImage(int imageId, String desc, String imagepath) {
		super();
		this.imageId = imageId;
		this.desc = desc;
		this.imagepath = imagepath;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	@Override
	public String toString() {
		return "UploadImage [imageId=" + imageId + ", desc=" + desc
				+ ", imagepath=" + imagepath + "]";
	}
	
	
}
