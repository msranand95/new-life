package com.lifebuds.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;






import com.lifebuds.domain.Donor;
import com.lifebuds.domain.Organ;
import com.lifebuds.service.ServiceFactory;

public class OrganDAOImpl extends MYSQLDatabaseInfo implements OrganDAO{

	
	@Override
	public void insertOrgan(Organ organ) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		
		connection=getConnection();
		try {
			statement=connection.prepareStatement("insert into tb_organ values(?,?,?,?,?,?,?,?,?,?,?)");
			statement.setInt(1, organ.getOrgan_id());
			statement.setInt(2, organ.getOrgan_kidney());
			statement.setInt(3, organ.getOrgan_cornea());
			statement.setInt(4, organ.getOrgan_lungs());
			statement.setInt(5, organ.getOrgan_pancreas());
			statement.setInt(6, organ.getOrgan_heart());
			statement.setInt(7, organ.getOrgan_liver());
			statement.setInt(8, organ.getOrgan_small_bowel());
			statement.setInt(9, organ.getOrgan_tissue());
			statement.setInt(10, organ.getOrgan_blood());
			statement.setInt(11, organ.getOrgan_user_id().getDonor_id());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
	}

	@Override
	public List<Organ> findOrgan_list() {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		List<Organ> organList=new ArrayList<Organ>();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_organ");
			resultset=statement.executeQuery();
			while(resultset.next())
			{
				Organ organ=new Organ();
				organ.setOrgan_id(resultset.getInt(1));
				organ.setOrgan_kidney(resultset.getInt(2));
				organ.setOrgan_cornea(resultset.getInt(3));
				organ.setOrgan_lungs(resultset.getInt(4));
				organ.setOrgan_pancreas(resultset.getInt(5));
				organ.setOrgan_heart(resultset.getInt(6));
				organ.setOrgan_liver(resultset.getInt(7));
				organ.setOrgan_small_bowel(resultset.getInt(8));
				organ.setOrgan_tissue(resultset.getInt(9));
				organ.setOrgan_blood(resultset.getInt(10));
				int donorId=resultset.getInt(11);
				Donor donor=ServiceFactory.getDonorServiceImpl().findDonor(donorId);
				organ.setOrgan_user_id(donor);
				
				
			
				organList.add(organ);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return organList;
	}

	@Override
	public Organ findOrgan(int id) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		Organ organ=new Organ();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_organ where user_id="+id);
			resultset=statement.executeQuery();
			if(resultset.next())
			{
				
				
			
				organ.setOrgan_id(resultset.getInt(1));
				organ.setOrgan_kidney(resultset.getInt(2));
				organ.setOrgan_cornea(resultset.getInt(3));
				organ.setOrgan_lungs(resultset.getInt(4));
				organ.setOrgan_pancreas(resultset.getInt(5));
				organ.setOrgan_heart(resultset.getInt(6));
				organ.setOrgan_liver(resultset.getInt(7));
				organ.setOrgan_small_bowel(resultset.getInt(8));
				organ.setOrgan_tissue(resultset.getInt(9));
				organ.setOrgan_blood(resultset.getInt(10) );
				int donorId=resultset.getInt(11);
				Donor donor=ServiceFactory.getDonorServiceImpl().findDonor(donorId);
				organ.setOrgan_user_id(donor);
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return organ;
	}

	@Override
	public void updateOrgans(Organ organ) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		System.out.println(organ.getOrgan_blood()+"= + =");
		connection=getConnection();
		try {
			statement=connection.prepareStatement("update tb_organ set kidney=?,cornea=?,lungs=?,pancreas=?,heart=?,liver=?,small_bowel=?,tissue=?,blood=? where user_id=?");
			
			statement.setInt(1, organ.getOrgan_kidney());
			statement.setInt(2, organ.getOrgan_cornea());
			statement.setInt(3, organ.getOrgan_lungs());
			statement.setInt(4, organ.getOrgan_pancreas());
			statement.setInt(5, organ.getOrgan_heart());
			statement.setInt(6, organ.getOrgan_liver());
			statement.setInt(7, organ.getOrgan_small_bowel());
			statement.setInt(8, organ.getOrgan_tissue());
			statement.setInt(9, organ.getOrgan_blood());
			
			statement.setInt(10, organ.getOrgan_user_id().getDonor_id());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
	}

	@Override
	public List<Organ> getOrgan(String organ) {
		// TODO Auto-generated method stub
		PreparedStatement statement=null;
		Connection connection=null;
		ResultSet resultset=null;
		List<Organ> organlist=new ArrayList<Organ>();
		
		String sql="select user_id from tb_organ where "+organ+"=1";
		//String sql="select * from tb_organ where kidney=1";

		System.out.println(sql);
		connection=getConnection();
		try {
			
			statement=connection.prepareStatement(sql);
			System.out.println(statement.toString());
			resultset=statement.executeQuery();
			System.out.println(resultset.toString());
			while(resultset.next())
			{
			   Organ org=new Organ();
			   Donor donor=new Donor();
			   int donor_id=resultset.getInt(1);
			   donor=ServiceFactory.getDonorServiceImpl().findDonor(donor_id);
			   org.setOrgan_user_id(donor);
			   organlist.add(org);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return organlist;
	}

	}
