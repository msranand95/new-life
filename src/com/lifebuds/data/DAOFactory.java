package com.lifebuds.data;



public class DAOFactory {

	public static Art_OrganDAOImpl getArt_OrganDAOImpl()
	{
		return new Art_OrganDAOImpl();
	}
	public static DonorDAOImpl getDonorDAOImpl()
	{
		return new DonorDAOImpl();
	}
	public static OrganDAOImpl getOrganDAOImpl()
	{
		return new OrganDAOImpl();
	}
	public static ProgramDAOImpl  getProgramDAOImpl()
	{
		return new ProgramDAOImpl();
	}
	public static ImageDAOImpl geImageDAOImpl()
	{
		return new ImageDAOImpl();
	}
}
