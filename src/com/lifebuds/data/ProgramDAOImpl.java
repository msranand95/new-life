package com.lifebuds.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;






import com.lifebuds.domain.Donor;
import com.lifebuds.domain.Program;
import com.lifebuds.service.ServiceFactory;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ProgramDAOImpl extends MYSQLDatabaseInfo implements ProgramDAO{

	@Override
	public void insertProgram(Program program) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		
		connection=getConnection();
		try {
			statement=connection.prepareStatement("insert into tb_program values(?,?,?,?,?,?)");
			statement.setInt(1, program.getPgm_id());
			statement.setString(2, program.getPgm_name());
			statement.setString(3, program.getPgm_what());
			statement.setString(4, program.getPgm_time());
			statement.setString(5, program.getPgm_venue());
			statement.setString(6, program.getPgm_date());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
	}

	@Override
	public List<Program> findProgram_list() {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		List<Program> programList=new ArrayList<Program>();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_program");
			resultset=statement.executeQuery();
			while(resultset.next())
			{
				Program  program=new Program();
				program.setPgm_id(resultset.getInt(1));
				program.setPgm_name(resultset.getString(2));
				program.setPgm_what(resultset.getString(3));
				program.setPgm_time(resultset.getString(4));
				program.setPgm_venue(resultset.getString(5));
				program.setPgm_date(resultset.getString(6));
				
				
			
				programList.add(program);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return programList;
	}

	@Override
	public Program findProgram(int id) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		Program  program=new Program();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_program where pgm_id="+id);
			resultset=statement.executeQuery();
			if(resultset.next())
			{
				
				
				program.setPgm_id(resultset.getInt(1));
				program.setPgm_name(resultset.getString(2));
				program.setPgm_what(resultset.getString(3));
				program.setPgm_time(resultset.getString(4));
				program.setPgm_venue(resultset.getString(5));
				program.setPgm_date(resultset.getString(6));
				
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
		
		
		return program;
	}

}
