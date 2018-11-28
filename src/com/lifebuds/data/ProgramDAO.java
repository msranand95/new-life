package com.lifebuds.data;

import java.util.List;

import com.lifebuds.domain.Program;

public interface ProgramDAO {


	public void insertProgram(Program program);
	public List<Program> findProgram_list();
	public Program findProgram(int id);
}
