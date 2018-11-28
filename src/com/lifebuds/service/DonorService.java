package com.lifebuds.service;

import java.util.List;

import com.lifebuds.domain.Donor;

public interface DonorService {

	public int insertDonor(Donor donor);
	public List<Donor> findDonor_list();
	public Donor findDonor(int id);
	public void updateDonor(Donor donor);
}
