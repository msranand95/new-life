package com.lifebuds.service;

import java.util.Collections;
import java.util.List;

import com.lifebuds.backingbean.BloodComparator;
import com.lifebuds.data.OrganDAO;
import com.lifebuds.domain.Organ;

public class OrganServiceImpl implements OrganService{

	private OrganDAO dao;
	
	
	
	public OrganServiceImpl(OrganDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void insertOrgan(Organ organ) {
		// TODO Auto-generated method stub
		dao.insertOrgan(organ);
	}

	@Override
	public List<Organ> findOrgan_list() {
		// TODO Auto-generated method stub
		return dao.findOrgan_list();
	}

	@Override
	public Organ findOrgan(int id) {
		// TODO Auto-generated method stub
		return dao.findOrgan(id);
	}

	@Override
	public void updateOrgans(Organ organ) {
		// TODO Auto-generated method stub
		dao.updateOrgans(organ);
	}

	@Override
	public List<Organ> getOrgan(String organ) {
		// TODO Auto-generated method stub
		List<Organ> organList=dao.getOrgan(organ);
		System.out.println("b4"+organList.toString());
		Collections.sort(organList, new BloodComparator());
		System.out.println("aftr"+organList.toString());
		
		return organList;
	}

	

}
