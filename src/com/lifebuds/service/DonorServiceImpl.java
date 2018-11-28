package com.lifebuds.service;

import java.util.List;

import com.lifebuds.data.DonorDAO;
import com.lifebuds.domain.Donor;

public class DonorServiceImpl implements DonorService{

	private DonorDAO dao;
	
	
	public DonorServiceImpl(DonorDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int insertDonor(Donor donor) {
		// TODO Auto-generated method stub
		return dao.insertDonor(donor);
	}

	@Override
	public List<Donor> findDonor_list() {
		// TODO Auto-generated method stub
		return dao.findDonor_list();
	}

	@Override
	public Donor findDonor(int id) {
		// TODO Auto-generated method stub
		return dao.findDonor(id);
	}

	public void updateDonor(Donor donor) {
		// TODO Auto-generated method stub
		dao.updateDonor(donor);
	}

}
