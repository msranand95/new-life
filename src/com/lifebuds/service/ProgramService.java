package com.lifebuds.service;

import java.util.List;

import com.lifebuds.domain.Program;

public interface ProgramService {

	public void insertProgram(Program program);
	public List<Program> findProgram_list();
	public Program findProgram(int id);
}
