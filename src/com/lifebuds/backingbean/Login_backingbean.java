package com.lifebuds.backingbean;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lifebuds.domain.Donor;
import com.lifebuds.service.ServiceFactory;


public class Login_backingbean {

	public String processRequest(HttpServletRequest request,HttpServletResponse response)
	{
		String command=null;
		command=request.getParameter("command");
		HttpSession session=request.getSession();
		if(command.equals("login"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			System.out.println("username="+username+",password="+password);
			List<Donor> donorList= ServiceFactory.getDonorServiceImpl().findDonor_list();
			
			for(Donor donor:donorList)
			{
				System.out.println(donor.toString());
				if((username.equals(donor.getDonor_email())) && (password.equals(donor.getDonor_password())))
				{
					if(donor.getDonor_role()==1)
					{
						session.setAttribute("admin", donor.getDonor_email());
					System.out.println("in admin");
					return "../Life/admin.jsp";
					}
					if(donor.getDonor_role()==0)
					{
						System.out.println("in user");
						session.setAttribute("user", donor.getDonor_email());
						session.setAttribute("user_id", donor.getDonor_id());
						return "../Life/User-profile.jsp";
					}
				}
				
			}
			session.setAttribute("err","Invalid username or password");
			return "../Life/logout.jsp";
		}
		else
		{
			session.setAttribute("err","Invalid username or password");
			return "../Life/logout.jsp";
		}
		
		
		
	}

}
