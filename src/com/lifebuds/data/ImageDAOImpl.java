package com.lifebuds.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lifebuds.domain.UploadImage;



public class ImageDAOImpl extends MYSQLDatabaseInfo implements ImageDAO{

	@Override
	public void insertImage(UploadImage image) {
		// TODO Auto-generated method stub
		PreparedStatement statement=null;
		Connection connection=null;
		
		try {
			connection=getConnection();
			
			statement=connection.prepareStatement("insert into tb_image values(?,?,?)");
			statement.setInt(1, image.getImageId());
			statement.setString(2, image.getDesc());
			statement.setString(3, image.getImagepath());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<UploadImage> imageList() {
		// TODO Auto-generated method stub
		PreparedStatement statement=null;
		Connection connection=null;
		ResultSet resultset=null;
		List<UploadImage> imageList=new ArrayList<UploadImage>();
		
		try {
			connection=getConnection();
			statement=connection.prepareStatement("select * from tb_image");
			resultset=statement.executeQuery();
			if(resultset!=null){
			while(resultset.next())
			{
				UploadImage img=new UploadImage();
				img.setImageId(resultset.getInt(1));
				img.setDesc(resultset.getString(2));
				img.setImagepath(resultset.getString(3));
				System.out.println(img.toString());
				imageList.add(img);
			}
			}
			else{
				System.out.println("no image");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeDBResource();
		}
		
		return imageList;
	}

}
