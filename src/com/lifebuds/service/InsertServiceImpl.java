package com.lifebuds.service;

import java.util.List;

import com.lifebuds.data.ImageDAO;
import com.lifebuds.domain.UploadImage;



public class InsertServiceImpl implements InsertService{

	private ImageDAO dao;
	
	
	
	public InsertServiceImpl(ImageDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void insertImage(UploadImage image) {
		// TODO Auto-generated method stub
		dao.insertImage(image);
	}

	@Override
	public List<UploadImage> imageList() {
		// TODO Auto-generated method stub
		return dao.imageList();
	}

}
