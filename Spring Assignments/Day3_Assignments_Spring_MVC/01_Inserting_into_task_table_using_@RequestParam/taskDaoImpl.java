[11:55 AM, 11/22/2021] B S Kushal: package com.sonata.springMvc;


import java.sql.*;
import java.util.*;


public class taskDaoImpl implements taskDao{
	int row=0;
	dbConnection db = new dbConnection();
	Task u=null;
	
	public int save(Object object) {
		try {
			u= (Task)object;
			PreparedStatement p=db.getCon().prepareStatement("insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
			p.setInt(1,u.getTaskid());
			p.setInt(2,u.getOwnerid());
			p.setInt(3,u.getCreatorid());
			p.setString(4,u.getName());
			p.setString(5,u.getDescrptn());
			p.setString(6,u.getStatus());
			p.setString(7,u.getPriority());
			p.setString(8, u.getName());
			p.setBoolean(9, u.isBookMarked());
			p.setString(11, u.getStatus_changed_on());
			p.setString(10, u.getCreated_on());
			row=p.executeUpdate();
			db.clo…
[11:55 AM, 11/22/2021] B S Kushal: package com.sonata.springMvc;

import java.sql.Connection;
import java.sql.DriverManager;
public class dbConnection {

	Connection con;
	
	public Connection getCon() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_casestudy","root","admin@123");
			}
			catch(Exception e) {
				System.out.print(e);
			}
			return con;
	}
	public void closeCon() {
		try {
			if(con !=null) {
				con.close();
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
