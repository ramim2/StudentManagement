package com.techpalle.dao;

import java.sql.*;

import com.techpalle.model.Student;

public class DataAccess {
	public static Connection con=null;
    public static PreparedStatement ps=null;
	
	public static void inserstudent(Student s) 
	{
	  try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","rootpassword");
			
			String qry="insert into student2(name,email,qualification,password,mobile) values(?,?,?,?,?)";
			
			ps= con.prepareStatement(qry);
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3,s.getQualification());
			ps.setString(4,s.getPassword());
			ps.setLong(5,s.getMobile());
			
			
			ps.executeUpdate();
			
			
		} 
		catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		} 
		catch (SQLException e1) 
		{
		
			e1.printStackTrace();
		}
		
		finally 
		{
			
			if(ps !=null) {
				try {
					ps.close();
				} catch (SQLException e1) 
				{
					
					e1.printStackTrace();
				}
				if(con!=null) {
					try {
						con.close();
					} 
					catch (SQLException e1)
					{
						
					e1.printStackTrace();
					}
				}
			}
		}
	}

}
