package com.sonata.springMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;
import com.sonata.casestudy.impl.userDaoImpl;


@Controller
public class HelloController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
			
			ModelAndView mav = new ModelAndView("index");
			return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		ModelAndView mav = new ModelAndView("Welcome");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_casestudy","root","admin@123");
			PreparedStatement p1=con.prepareStatement("select userid from user where username=? and pwd=?");
			p1.setString(1, username);
			p1.setString(2, password);
			ResultSet rs=p1.executeQuery();
			if(rs.next()) {
				
				return mav;
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return new ModelAndView("NewFile");
	}
	@RequestMapping("/task")
	public ModelAndView showTask() {
			
			ModelAndView mav = new ModelAndView("task");
			return mav;
	}
	@RequestMapping("/createtask")
	public ModelAndView createTask(@RequestParam("taskid") int taskid,@RequestParam("ownerid") int ownerid,@RequestParam("creatorid") int creatorid, @RequestParam("name") String name, @RequestParam("descrptn") String descrptn, @RequestParam("status") String status
    		,@RequestParam("priority") String priority,@RequestParam("notes") String notes,@RequestParam("isBookMarked") String isBookMarked,@RequestParam("created_on") String created_on,@RequestParam("status_changed_on") String status_changed_on,Model model) {
			
			model.addAttribute("taskid",taskid);
			model.addAttribute("ownerid",ownerid);
			model.addAttribute("creatorid",creatorid);
			model.addAttribute("name",name);
			model.addAttribute("descrptn",descrptn);
			model.addAttribute("status",status);
			model.addAttribute("priority",priority);
			model.addAttribute("notes",notes);
			model.addAttribute("isBookMarked",isBookMarked);
			model.addAttribute("created_on",created_on);
			model.addAttribute("status_changed_on",status_changed_on);
			
			Task e = new Task();
			e.setTaskid(taskid);
			e.setOwnerid(ownerid);
			e.setCreatorid(creatorid);
			e.setName(name);
			e.setDescrptn(descrptn);
			e.setStatus(status);
			e.setPriority(priority);
			e.setNotes(notes);
			if (isBookMarked=="true") {
			e.setBookMarked(true);}
			else {
			e.setBookMarked(false);	
			}
			e.setCreated_on(created_on);
			e.setStatus_changed_on(status_changed_on);
			
			taskDaoImpl d= new taskDaoImpl();
			int row = d.save(e);
			if(row==0) {
				return new ModelAndView("NewFile");
			}
	
			return new ModelAndView("Welcome");
	}
}
