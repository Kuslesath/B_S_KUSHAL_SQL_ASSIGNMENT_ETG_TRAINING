package com.sonata.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("user", "command", new User());
	   }
	
	@RequestMapping(value = "/user1", method = RequestMethod.POST)
	   public String addUser(@ModelAttribute("addUser")User u, ModelMap model) {
	      	
			int row=0;
			userDaoImpl d= new userDaoImpl();
			row = d.save(u);
			
			if(row!=0) {
				return "successUser";
			}
			else
				return "failureUser";
	   }
}
