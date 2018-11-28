package com.lifebuds.service;

import java.util.List;

import com.lifebuds.domain.UploadImage;



public interface InsertService {

	public void insertImage(UploadImage image);
	public List<UploadImage> imageList();
}
