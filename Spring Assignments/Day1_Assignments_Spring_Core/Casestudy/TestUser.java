package com.sonata.casestudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestUser {

	//@Autowired
	//userDao userDaoImpl ;
	public boolean f;
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(TestUser.class, args);
		userDao  g = (userDao) ctx.getBean("userDaoImpl");
		TestUser t=new TestUser ();
		t.f= g.validateUser("kbs","23312");
		if (t.f==true) {
			System.out.println("Login Sucessful");
		}
		else System.out.println("Login UnSucessful");

	}
}

