package com.lifebuds.service;

import java.util.List;

import com.lifebuds.domain.Organ;

public interface OrganService {

	public void insertOrgan(Organ organ);
	public List<Organ> findOrgan_list();
	public Organ findOrgan(int id);
	public void updateOrgans(Organ organ);
	public List<Organ> getOrgan(String organ);
}
