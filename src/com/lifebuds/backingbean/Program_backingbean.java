package com.lifebuds.backingbean;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lifebuds.domain.Program;
import com.lifebuds.service.ServiceFactory;

public class Program_backingbean {

	public String processRequest(HttpServletRequest  request,HttpServletResponse response )
	{
		String command = null;
		
		if(request.getParameter("command")!=null){
		command=request.getParameter("command");
		}
		
			
		
		
		
		if(command.equals("addProgram"))
		{
			Program program=readProgram(request);
			ServiceFactory.getProgramServiceImpl().insertProgram(program);
			return "../Life/forward.jsp?page=program";
			
		}
		if(command.equals("image"))
		{
			System.out.println(command);
			return "../Life/admin.jsp";
		}
		
		
		
		return command;
	}

	
	private Program readProgram(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Program program=new Program();
		program.setPgm_name(request.getParameter("program_name"));
		program.setPgm_what(request.getParameter("program_about"));
		program.setPgm_date(request.getParameter("program_date"));
		program.setPgm_time(request.getParameter("program_time"));
		program.setPgm_venue(request.getParameter("program_place"));
		
		return program;
	}
}
