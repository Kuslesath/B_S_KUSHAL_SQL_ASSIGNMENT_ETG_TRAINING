package com.sonata.springMvc1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.sonata.springMvc1.Task;
import com.sonata.springMvc1.TaskInterface;
import com.sonata.springMvc1.dbConnection;

@Component
public class DefaultTask implements TaskInterface {

	
	public List<Task> printTask(int t){
		dbConnection db = new dbConnection();
		List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getCon().prepareStatement("select * from task where taskid=?");
				p1.setInt(1, t);
				ResultSet rs=p1.executeQuery();
				while(rs.next()) {
					Task us = new Task();
					int taskid= rs.getInt(1);
					int ownerid=rs.getInt(2);
					int creatorid=rs.getInt(3);
					String name= rs.getString(4);
					String descrptn = rs.getString(5);
					String status = rs.getString(6);
					String priority = rs.getString(7);
					String notes = rs.getString(8);
					Boolean isbm = rs.getBoolean(9);
					String sco = rs.getString(11);
					String createdon = rs.getString(10);

					us.setTaskid(taskid);
					us.setOwnerid(ownerid);
					us.setCreatorid(creatorid);
					us.setName(name);
					us.setDescrptn(descrptn);
					us.setStatus(status);
					us.setPriority(priority);
					us.setNotes(notes);
					us.setBookMarked(isbm);
					us.setStatus_changed_on(sco);
					us.setCreated_on(createdon);
					
					e1.add(us);
				}
		 	}
			catch(Exception e) {System.out.println();}
		 	return e1;
	}

	public int changeTask(int t,String a,String b) {
	int row=0;
	try {
	dbConnection db = new dbConnection();
	PreparedStatement p=db.getCon().prepareStatement("update task set notes=?, isbookmarked=? where taskid=?");
	p.setString(1, a);
	boolean bool = Boolean.parseBoolean(b);
	p.setBoolean(2, bool);
	p.setInt(3, t);
	row=p.executeUpdate();
	db.closeCon();
	}
	catch(Exception e) {System.out.println();}
	return row;
	}

}
