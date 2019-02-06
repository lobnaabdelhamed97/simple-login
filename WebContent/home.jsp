<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Include CSS File Here -->
<link rel="stylesheet" type="text/css" href="style.css">
 
<!-- Include JS File Here -->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="registeration.js"></script>

<title>LoginRegister</title>
</head>
<div class="header">
    <h1>Register</h1>
</div>
<body>

<form name="RegForm" action="FirstServlet" method="post" >

		<div class="input-group">
      <label>Username</label>	
					<input type="text" name="username" id="name" placeholder="enter your name">
				 </div>
			<div class="input-group">
      <label>Email</label>
      <input type="email" name="email" id="email" placeholder="enter your email">
    </div>
    <div class="input-group">
      <label>Password</label>
      <input type="password" name="password" id="password" placeholder="enter your password">
    </div>
    <div class="input-group">
      <label>Confirm password</label>
      <input type="password" name="cpassword" id="cpassword" placeholder="enter the same password">
    </div>
    
    <label>Birth date</label>
 <input type="date" name="bday">
    
    <div class="input-group">
      <label>Address</label>
      <input type="password" name="address" id="address" placeholder="enter your address">
    </div>
			
			 <div class="input-group">
      <label>Contact Number</label>
      <input type="text" name="contact" id="contact" placeholder="enter your mobile number">
    </div>
    
      <label>Department</label>
      <select name="department">
  <option value="production">Production</option>
  <option value="marketing">Marketing</option>
  <option value="accounting">Accounting and Finance</option>
  <option value="research">Research and Development</option>
    <option value="purchasing">Purchasing</option>
    <option value="hr">Human Resource Management</option>
</select>
			<br>
			<br>
			<br>
			<br>
			<br>
			<input type="button" class="btn" name="register" id="register" value="Register">
   	 <br> 
   	    		 
    <p>
        Already a member? <a href="login.jsp">Sign in</a>
    </p>
	
</body>
</html>
