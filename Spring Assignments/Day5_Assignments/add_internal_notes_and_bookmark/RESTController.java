package com.sonata.springMvc1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.ui.Model;

@RestController
//@org.springframework.beans.factory.annotation.Autowired(required=true)	
public class RESTController {
	
	@Autowired
	TaskInterface task;
	
	@RequestMapping(value ="/addnotes/{notes}/taskid/{taskid}/ibm/{ibm}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> addNotes(@PathVariable int taskid, @PathVariable String notes,@PathVariable String ibm, Model model) {
		model.addAttribute("notes", notes);
		model.addAttribute("ibm", ibm);
		model.addAttribute("taskid", taskid);
		row=task.changeTask(taskid,notes,ibm);
		return task.printTask(taskid);
	}
	
	
}
