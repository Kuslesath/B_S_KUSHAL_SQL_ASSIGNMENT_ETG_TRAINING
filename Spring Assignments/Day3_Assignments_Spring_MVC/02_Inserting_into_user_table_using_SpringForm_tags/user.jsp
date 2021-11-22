<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>Create user Account</title>
	</head>	
	<body>
		<div class="container">
			<h3>
				Create a user Account 
			</h3>
			<div class="span-12 last">	
				<form:form action="user1" method="post">
				  	<fieldset>		
						<legend>Enter all Fields</legend>
						<p>
							<form:label path="userid" >User Id: </form:label>
							<form:input path="userid" /> <form:errors path="userid" />			
						</p>
						<p>	
							<form:label path="username">User Name: </form:label>
							<form:input path="username" /> <form:errors path="username" />
						</p>
						<p>
							<form:label path="email" >Email: </form:label>
							<form:input path="email" /> <form:errors path="email" />			
						</p>
						<p>	
							<form:label path="fname">First Name: </form:label>
							<form:input path="fname" /> <form:errors path="fname" />
						</p>
						<p>
							<form:label path="lname" >Last Name: </form:label>
							<form:input path="lname" /> <form:errors path="lname" />			
						</p>
						<p>	
							<form:label path="phno">Phone No: </form:label>
							<form:input path="phno" /> <form:errors path="phno" />
						</p>
						<p>
							<form:label path="role" >Role: </form:label>
							<form:input path="role" /> <form:errors path="role" />			
						</p>
						<p>	
							<form:label path="isactive">Is Active: </form:label>
							<form:input path="isactive" /> <form:errors path="isactive" />
						</p>
						<p>
							<form:label path="dob" >DOB: </form:label>
							<form:input path="dob" /> <form:errors path="dob" />			
						</p>
						<p>	
							<form:label path="created_on">Created_on: </form:label>
							<form:input path="created_on" /> <form:errors path="created_on" />
						</p>
						<p>
							<form:label for="pwd" path="pwd" >Password: </form:label>
							<form:input path="pwd" /> <form:errors path="pwd" />
						</p>
						<p>	
							<input type="submit" />
						</p>
					</fieldset>
				</form:form>
			</div>
			<hr>		
		</div>
	</body>
</html>