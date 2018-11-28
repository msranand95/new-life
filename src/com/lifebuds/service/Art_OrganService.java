package com.lifebuds.service;

import java.util.List;

import com.lifebuds.domain.Art_Organ;

public interface Art_OrganService {

	public void insertShop(Art_Organ art_Organ);
	public List<Art_Organ> findShop_list();
	public Art_Organ findShop(int id);
}
