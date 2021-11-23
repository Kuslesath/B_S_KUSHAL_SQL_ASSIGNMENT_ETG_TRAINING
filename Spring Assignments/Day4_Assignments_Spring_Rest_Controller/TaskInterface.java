package com.example.demo;

import java.util.List;


public interface TaskInterface {
	public Task getTask(int id);
	public List<Task> getAllTask();
	public List<Task> printTask(int t);
	public int setPriority(int t,String pr);
	public int addTask(Task t);
}
