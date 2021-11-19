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
	
	
	@RequestMapping("/NewFile")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		ModelAndView mav = new ModelAndView("Welcome");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		int f11=0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_casestudy","root","admin@123");
			PreparedStatement p1=con.prepareStatement("select userid from user where username=? and pwd=?");
			p1.setString(1, username);
			p1.setString(2, password);
			ResultSet rs=p1.executeQuery();
			if(rs.next()) {
				f11=1;
				return mav;
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return new ModelAndView("index");
	}
}
