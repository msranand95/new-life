package com.lifebuds.data;

import java.util.List;

import com.lifebuds.domain.UploadImage;



public interface ImageDAO {

	public void insertImage(UploadImage image);
	public List<UploadImage> imageList();
}
