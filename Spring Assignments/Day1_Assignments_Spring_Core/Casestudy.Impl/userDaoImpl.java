package com.sonata.casestudy.impl;

import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sonata.casestudy.userDao;

@Component
public class userDaoImpl implements userDao{

	@Autowired
	private dbInterface dbConnection ;
	
	@Override
	public boolean validateUser(String u,String p) {
		boolean f=false;
		try {
			PreparedStatement p1=dbConnection.getCon().prepareStatement("select userid from user where username=? and pwd=?");
			p1.setString(1, u);
			p1.setString(2, p);
			ResultSet rs=p1.executeQuery();
			if (rs.next()) {
				f=true;
				System.out.println("Logged in user id is: "+rs.getInt(1));
			}
	 	}
		catch(Exception e) {System.out.println(e);}
		return f;
	}
}
