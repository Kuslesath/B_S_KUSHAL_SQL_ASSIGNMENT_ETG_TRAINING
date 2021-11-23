package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	@Autowired
	TaskInterface task;
	//@GetMapping(value = "/task")
	int row=0;	
	@RequestMapping(value = "/task", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask1() {
		return task.getAllTask();
	}
	@RequestMapping(value ="/taskid/{taskid}/priority/{pri}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask(@PathVariable int taskid, @PathVariable String pri, Model model) {
		model.addAttribute("pri", pri);
		model.addAttribute("taskid", taskid);
		row=task.setPriority(taskid,pri);
		return task.printTask(taskid);
	}
	@RequestMapping(value ="/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask2(@PathVariable int taskid, Model model) {
		model.addAttribute("taskid", taskid);
		return task.printTask(taskid);
	}
	
	@PostMapping(value= "/addTask", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task t) throws Exception
	{
		task.addTask(t);
		return t;
	}

}
