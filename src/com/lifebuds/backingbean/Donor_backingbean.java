package com.lifebuds.backingbean;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lifebuds.domain.Donor;
import com.lifebuds.domain.Organ;
import com.lifebuds.service.ServiceFactory;

public class Donor_backingbean {
	int donor_id=0;
	public String processRequest(HttpServletRequest request,HttpServletResponse response)
	{
		String command=null;
		
		command=request.getParameter("command");
		System.out.println(command+"=command");
		if(command.equals("org"))
		{
			
			String organName=request.getParameter("organ");
			List<Organ> orgList=ServiceFactory.getOrganServiceImpl().getOrgan(organName);
			System.out.println(orgList.toString());
			
			return "../Life/organs-table.jsp";
		}
		
		if(command.equals("saveDonor"))
		{
			Donor donor=readDonor(request);
			System.out.println("help");
			int user_id=ServiceFactory.getDonorServiceImpl().insertDonor(donor);
			Organ organ=new Organ();
			System.out.println("generated id="+user_id);
			donor.setDonor_id(user_id);
		  
			organ.setOrgan_user_id(donor);
			ServiceFactory.getOrganServiceImpl().insertOrgan(organ);
			return "../Life/index.jsp";
			
		}
		if(command.equals("updateDonor"))
		{
			donor_id=Integer.parseInt(request.getParameter("donor_id"));
			Donor donor=readDonor(request);
			
			donor.setDonor_id(donor_id);
			ServiceFactory.getDonorServiceImpl().updateDonor(donor);
			return "../Life/User-profile.jsp";
		}
		if(command.equals("updateDonate"))
		{
			System.out.println(".............");
			String[] organ;
			Organ updateOrgan=new Organ();
			organ = request.getParameterValues("organ");
			updateOrgan=readOrganstatus(organ);
			
			HttpSession session=request.getSession();
			int user_id=(int)session.getAttribute("user_id");
			Donor donor=new Donor();
			donor.setDonor_id(user_id);
			updateOrgan.setOrgan_user_id(donor);
			System.out.println (updateOrgan.toString()+"----- -----");
			ServiceFactory.getOrganServiceImpl().updateOrgans(updateOrgan);
			
				
			 return "../Life/User-profile.jsp";

		}
		
		
		
		return command;
	}

	private Organ readOrganstatus(String[] organ) {
		// TODO Auto-generated method stub
		Organ updateOrgan=new Organ();
		
		if (organ != null) 
		 {
			
			 for (int i = 0; i < organ.length; i++)
			 {

						 switch (organ[i])
						 {
						 
						 case "kidney":
							 updateOrgan.setOrgan_kidney(1);
							 break;
						 case "liver":
							 updateOrgan.setOrgan_liver(1);
							 break;
						 case "lungs":
							 updateOrgan.setOrgan_lungs(1);
							 break;
						 case "blood":
							 updateOrgan.setOrgan_blood(1);	 
							 break;
						 case "heart":
							updateOrgan.setOrgan_heart(1);		 
							 break;
						 case "pancreas":
							 updateOrgan.setOrgan_pancreas(1);			 
							 break;
						 case "intestine":
							 updateOrgan.setOrgan_small_bowel(1);				 
							 break;	
						 case "corneas":
							 updateOrgan.setOrgan_cornea(1);
							 break;
 
						 }

			 }
		 }
		
		return updateOrgan;
	}

	private Donor readDonor(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Donor donor=new Donor();
		donor.setDonor_fname(request.getParameter("fname"));
		donor.setDonor_lname(request.getParameter("lname"));
		donor.setDonor_age(request.getParameter("dob"));
		donor.setDonor_address(request.getParameter("address"));
		donor.setDonor_phone(request.getParameter("phone"));
		donor.setDonor_gender(request.getParameter("gender"));
	
			donor.setDonor_email(request.getParameter("email"));
		
		
		donor.setDonor_password(request.getParameter("password"));
		donor.setDonor_bloodgroup(request.getParameter("bloodgroup"));
		
		return donor;
	}
}
