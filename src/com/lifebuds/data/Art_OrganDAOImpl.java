package com.lifebuds.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lifebuds.domain.Art_Organ;
import com.lifebuds.service.ServiceFactory;

public class Art_OrganDAOImpl extends MYSQLDatabaseInfo implements Art_OrganDAO{

	@Override
	public void insertShop(Art_Organ art_Organ) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		
		connection=getConnection();
		try {
			statement=connection.prepareStatement("insert into tb_art_organ values(?,?,?,?,?,?)");
			statement.setInt(1, art_Organ.getShop_id());
			statement.setString(2, art_Organ.getShop_name());
			statement.setString(3, art_Organ.getShop_place());
			statement.setString(4, art_Organ.getShop_contact());
			statement.setString(5, art_Organ.getShop_address());
			statement.setString(6, art_Organ.getShop_desc());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
	}

	@Override
	public List<Art_Organ> findShop_list() {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		List<Art_Organ> art_organList=new ArrayList<Art_Organ>();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_art_organ");
			resultset=statement.executeQuery();
			while(resultset.next())
			{
				Art_Organ art_organ=new Art_Organ();
				art_organ.setShop_id(resultset.getInt(1));
				art_organ.setShop_name(resultset.getString(2));
				art_organ.setShop_place(resultset.getString(3));
				art_organ.setShop_contact(resultset.getString(4));
				art_organ.setShop_address(resultset.getString(5));
				art_organ.setShop_desc(resultset.getString(6));		
			
				art_organList.add(art_organ);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return art_organList;
	}

	@Override
	public Art_Organ findShop(int id) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		Art_Organ art_organ=new Art_Organ();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_art_organ where shop_id="+id);
			resultset=statement.executeQuery();
			if(resultset.next())
			{
				
				art_organ.setShop_id(resultset.getInt(1));
				art_organ.setShop_name(resultset.getString(2));
				art_organ.setShop_place(resultset.getString(3));
				art_organ.setShop_contact(resultset.getString(4));
				art_organ.setShop_address(resultset.getString(5));
				art_organ.setShop_desc(resultset.getString(6));		
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return art_organ;
	
	}

}
