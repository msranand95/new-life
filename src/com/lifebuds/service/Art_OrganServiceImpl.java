package com.lifebuds.service;

import java.util.List;

import com.lifebuds.data.Art_OrganDAO;
import com.lifebuds.domain.Art_Organ;

public class Art_OrganServiceImpl implements Art_OrganService {

	private Art_OrganDAO dao;
	
	
	
	public Art_OrganServiceImpl(Art_OrganDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void insertShop(Art_Organ art_Organ) {
		// TODO Auto-generated method stub
		dao.insertShop(art_Organ);
	}

	@Override
	public List<Art_Organ> findShop_list() {
		// TODO Auto-generated method stub
		return dao.findShop_list();
	}

	@Override
	public Art_Organ findShop(int id) {
		// TODO Auto-generated method stub
		return dao.findShop(id);
	}

}
