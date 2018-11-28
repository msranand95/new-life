package com.lifebuds.service;


import com.lifebuds.data.DAOFactory;


public class ServiceFactory {

	public static Art_OrganServiceImpl getArt_OrganServiceImpl()
	{
		return new Art_OrganServiceImpl(DAOFactory.getArt_OrganDAOImpl());
	}
	public static DonorServiceImpl getDonorServiceImpl()
	{
		return new DonorServiceImpl(DAOFactory.getDonorDAOImpl());
	}
	public static OrganServiceImpl getOrganServiceImpl()
	{
		return new OrganServiceImpl(DAOFactory.getOrganDAOImpl());
	}
	public static ProgramServiceImpl  getProgramServiceImpl()
	{
		return new ProgramServiceImpl(DAOFactory.getProgramDAOImpl());
	}
	public static InsertServiceImpl getInsertServiceImpl()
	{
		return new InsertServiceImpl(DAOFactory.geImageDAOImpl());
		
	}

}
