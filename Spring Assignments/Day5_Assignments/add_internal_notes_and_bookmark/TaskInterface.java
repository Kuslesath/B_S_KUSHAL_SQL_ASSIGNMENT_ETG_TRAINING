package com.sonata.springMvc1;


import java.util.List;


public interface TaskInterface {
	
	
	public List<Task> printTask(int t);
	public int changeTask(int t,String n,String b);
	
}