package com.lifebuds.service;

import java.util.List;

import com.lifebuds.data.ProgramDAO;
import com.lifebuds.domain.Program;

public class ProgramServiceImpl implements ProgramService{


	private ProgramDAO dao;
	
	
	
	public ProgramServiceImpl(ProgramDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void insertProgram(Program program) {
		// TODO Auto-generated method stub
		dao.insertProgram(program);
	}

	@Override
	public List<Program> findProgram_list() {
		// TODO Auto-generated method stub
		return dao.findProgram_list();
	}

	@Override
	public Program findProgram(int id) {
		// TODO Auto-generated method stub
		return dao.findProgram(id);
	}

}
