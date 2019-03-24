<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Response form</title>
<style>
body {
  margin: 0;
  background: #ADD8E6; 
}
body {font-family: Arial, Helvetica, sans-serif;}
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: #474e5d;
    padding-top: 50px;
}
/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 50%; /* Could be more or less, depending on screen size */
}
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
    postion:absolute;
    right:0;
    top:0;
}
button:hover {
    opacity:1;
}
.container {
    padding: 16px;
}
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}
#button { 
  display: block;
  width: 80%;
  padding: .4rem;
  border: none; 
  margin: 1rem auto; 
  font-size: 1.3rem;
  background: rgba(255,255,255,0.23);
  color: #fff;
  border-radius: 3px; 
  cursor: pointer;
  transition: .3s background;
  
}
/* The Close Button (x) */

.close {
    position: absolute;
    right: 35px;
    top: 15px;
    font-size: 40px;
    font-weight: bold;
    color: #f1f1f1;
}
.close:hover,
.close:focus {
    color: #f44336;
    cursor: pointer;
}
/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}
/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}

</style>
</head>
<body>
<%  
  String name=request.getParameter("userName");
  String uname=request.getParameter("userEmail");
  
%>


<center>

 <form name="respForm" action="registered" method="post" class="modal-content">
<div class="container">
    <center>
<h1>REGISTERED</h1>
<b>User has been registered</b><br><br>
 <u>User Details:</u>
 <div class="modal-content">
 
  Name:<%= name %><br>
  User Name:<%= uname %>
  </div>
  </center>
  </div>

  PLEASE GO AHEAD AND FILL IN THE PROFILE DETAILS
     <input type="submit" name="submit" value="Later"  class="cancelbtn" /><br><br> 
  <input type="submit" name="submit" value="Continue" class="cancelbtn"/><br><br> 
  
   <br><br><br>
 
 
   
 </form>
   
</center>

</body>
</html>