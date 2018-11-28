package com.lifebuds.backingbean;

import java.util.Comparator;

import com.lifebuds.domain.Organ;

public  class BloodComparator implements Comparator<Organ>{

	@Override
	public int compare(Organ a,Organ b) {
		// TODO Auto-generated method stub.
		return a.getOrgan_user_id().getDonor_bloodgroup().compareToIgnoreCase(b.getOrgan_user_id().getDonor_bloodgroup());
		
		
	}

	
}
