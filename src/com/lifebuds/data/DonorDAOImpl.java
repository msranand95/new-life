package com.lifebuds.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lifebuds.domain.Donor;
import com.lifebuds.service.ServiceFactory;

public class DonorDAOImpl extends MYSQLDatabaseInfo implements DonorDAO {

	@Override
	public int insertDonor(Donor donor) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		int id=0;
		connection=getConnection();
		try {
			statement=connection.prepareStatement("insert into tb_donor values(?,?,?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, donor.getDonor_id());
			statement.setString(2, donor.getDonor_fname());
			statement.setString(3, donor.getDonor_lname());
			statement.setString(4, donor.getDonor_age());
			statement.setString(5, donor.getDonor_address());
			statement.setString(6, donor.getDonor_phone());
			statement.setString(7, donor.getDonor_gender());
			statement.setString(8, donor.getDonor_email());
			statement.setString(9, donor.getDonor_password());
			statement.setString(10, donor.getDonor_bloodgroup());
			statement.setInt(11, 0);
			statement.executeUpdate();
			
			ResultSet s=statement.getGeneratedKeys();
			System.out.println("generated="+id);
			if(s.next())
			{
				id=s.getInt(1);
				System.out.println("generated="+id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
//		try {
//			ResultSet rs=statement.getGeneratedKeys();
//				if(rs.next())
//				{
//					 id=rs.getInt(1);
//				}
//				statement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		closeDBResource();
		return id;
	}

	@Override
	public List<Donor> findDonor_list() {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		List<Donor> donorList=new ArrayList<Donor>();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_donor");
			resultset=statement.executeQuery();
			while(resultset.next())
			{
				Donor donor=new Donor();
				donor.setDonor_id(resultset.getInt(1));
				donor.setDonor_fname(resultset.getString(2));
				donor.setDonor_lname(resultset.getString(3));
				donor.setDonor_age(resultset.getString(4));
				donor.setDonor_address(resultset.getString(5));
				donor.setDonor_phone(resultset.getString(6));
				donor.setDonor_gender(resultset.getString(7));
				donor.setDonor_email(resultset.getString(8));
				donor.setDonor_password(resultset.getString(9));
				donor.setDonor_bloodgroup(resultset.getString(10));
				donor.setDonor_role(resultset.getInt(11));
				
			
				donorList.add(donor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
		
		
		
		return donorList;
	}

	@Override
	public Donor findDonor(int id) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		Donor donor=new Donor();
		
		connection=getConnection();
		
		try {
			statement=connection.prepareStatement("select * from tb_donor where donor_id="+id);
			resultset=statement.executeQuery();
			if(resultset.next())
			{
				
				
				donor.setDonor_id(resultset.getInt(1));
				donor.setDonor_fname(resultset.getString(2));
				donor.setDonor_lname(resultset.getString(3));
				donor.setDonor_age(resultset.getString(4));
				donor.setDonor_address(resultset.getString(5));
				donor.setDonor_phone(resultset.getString(6));
				donor.setDonor_gender(resultset.getString(7));
				donor.setDonor_email(resultset.getString(8));
				donor.setDonor_password(resultset.getString(9));
				
				donor.setDonor_bloodgroup(resultset.getString(10));
				donor.setDonor_role(resultset.getInt(11));
			
				System.out.println("**********"+donor.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeDBResource();
		
		return donor;
	}

	@Override
	public void updateDonor(Donor donor) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
	
		connection=getConnection();
		try {
			statement=connection.prepareStatement("update tb_donor set donor_fname=?,donor_lname=?,"
					+ "donor_age=?,donor_address=?,donor_phone=?,donor_password=?,"
					+ "donor_bloodgroup=? where donor_id="+donor.getDonor_id());
			
			statement.setString(1, donor.getDonor_fname());
			statement.setString(2, donor.getDonor_lname());
			statement.setString(3, donor.getDonor_age());
			statement.setString(4, donor.getDonor_address());
			statement.setString(5, donor.getDonor_phone());
			
			
			statement.setString(6, donor.getDonor_password());
			statement.setString(7, donor.getDonor_bloodgroup());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeDBResource();
	}

}
