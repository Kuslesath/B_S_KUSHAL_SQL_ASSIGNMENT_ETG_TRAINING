package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Task;
import com.example.demo.TaskInterface;
import com.example.demo.*;

@Component
public class DefaultTask implements TaskInterface {

	@Override
	public Task getTask(int id) {
		Task t  = new Task();
		//conntec the db, get the task with id 
		t.setTaskid(100);
		//t.setTaskname("REST Controller");
		//t.setDesc("Write a rest contrller for getting tasks");
		return t;
	}
	@Override
	public List<Task> getAllTask() {
		dbConnection db = new dbConnection();
		List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getCon().prepareStatement("select * from task");
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
	public int setPriority(int t,String pr) {
		int row=0;
		try {
			dbConnection db = new dbConnection();
			PreparedStatement p=db.getCon().prepareStatement("update task set priority=? where taskid=?");
			p.setInt(2, t);
			p.setString(1, pr);
			row=p.executeUpdate();
			db.closeCon();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}
	public int addTask(Task u) {
		try {
			dbConnection db = new dbConnection();
			PreparedStatement p=db.getCon().prepareStatement("insert into task values(?,?,?,null,null,null,null,null,null,null,null)");
			p.setInt(1,u.getTaskid());
			p.setInt(2,u.getOwnerid());
			p.setInt(3,u.getCreatorid());
			return p.executeUpdate();
		}
		catch(Exception e) {System.out.println(e);}
		return 0;
	};

}
