<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>

<body>
<center>
      <form  action = "createtask" method="get">
      			<h1>Welcome, Fill all the feilds to create a task </h1>
      			
       			<label>Task Id: </label>
                <input type = "text"  name= "taskid"/>
                <br> <br> 
             	<label>Owner Id: </label>
                <input type = "text"  name = "ownerid"/>   
                <br><br>   
                <label>creator id: </label>
                <input type = "text"  name = "creatorid"/> 
				<br><br>
				<label>Name: </label>
                <input type = "text"  name = "name"/>   
                <br><br>
                <label>Description: </label>
                <input type = "text"  name = "descrptn"/>   
                <br><br>
                <label>Status: </label>
                <input type = "text"  name = "status"/>   
                <br><br>
                <label>Priority: </label>
                <input type = "text"  name = "priority"/>   
                <br><br>
                <label>Notes: </label>
                <input type = "text"  name = "notes"/>   
                <br><br>
                <label>Bookmark: </label>
                <input type = "text"  name = "isBookMarked"/>   
                <br><br>
                <label>Created on: </label>
                <input type = "text"  name = "created_on"/>   
                <br><br>
                <label>Status changed on: </label>
                <input type = "text"  name = "status_changed_on"/>   
                <br><br>
                <input type = "submit" value = "Create_task"/> 
                
      </form>
</center>
</body>
</html>
