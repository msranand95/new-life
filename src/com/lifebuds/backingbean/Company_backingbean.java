package com.lifebuds.backingbean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lifebuds.domain.Art_Organ;
import com.lifebuds.service.ServiceFactory;

public class Company_backingbean {

	public String processRequest(HttpServletRequest request, HttpServletResponse response)
	{
		String command=null;
		String shopid=null;
		command=request.getParameter("command");
		shopid=request.getParameter("shopid");
		
		System.out.println(command);
		System.out.println(shopid);
		if(command.equals("addCompany"))
		{
			Art_Organ company=readCompany(request);
			ServiceFactory.getArt_OrganServiceImpl().insertShop(company);
			return "../Life/forward.jsp?page=company";
		}
		if(command.equals("findshop"))
		{
			return "../Life/modal_generator.jsp";
		}
		
		return command;
	}

	private Art_Organ readCompany(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Art_Organ company=new Art_Organ();
		company.setShop_name(request.getParameter("company_name"));
		company.setShop_place(request.getParameter("company_place"));
		company.setShop_contact(request.getParameter("company_phone"));
		company.setShop_desc(request.getParameter("company_desc"));
		company.setShop_address(request.getParameter("company_address"));
		
		return company;
	}
}
