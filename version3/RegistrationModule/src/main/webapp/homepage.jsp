<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  margin: 0;
  background: #000; 
}
fieldset {
    margin: 8px;
    width: 600px;
    length:700px;
    position:center;
    border: 1px solid silver;
    padding: 8px;    
    border-radius: 4px;
    }
video { 
    position: fixed;
    top: 50%;
    left: 50%;
    min-width: 100%;
    min-height: 100%;
    width: auto;
    height: auto;
    z-index: -100;
    transform: translateX(-50%) translateY(-50%);
 background: url('//demosthenes.info/assets/images/polina.jpg') no-repeat;
  background-size: cover;
  transition: 1s opacity;
}
#car { 
  font-family: Agenda-Light, Agenda Light, Agenda, Arial Narrow, sans-serif;
  font-weight:100; 
  background: rgba(0,0,0,0.3);
  color: white;
  padding: 2rem;
  width: 23%;
  height: 300px;
  margin:2rem;
  float: right;
  font-size: 1.2rem;
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
input[type=submit] {
    width: 10em;  height: 2.5em;
    font-size: 16px;
}
input[type=text]{
width: 10em;  height: 1.6em;
font-size: 20px;
font-style: normal;
}
input[type=password]{
width: 10em;  height: 1.6em;
font-size: 20px;
font-style: normal;
}
h1{
color: #ADD8E6;
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
/* Full-width input fields */
input[type=text], {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}
/* Add a background color when the inputs get focus */
input[type=text]:focus,  {
    background-color: #ddd;
    outline: none;
}
/* Set a style for all buttons */
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
/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}
/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}
/* Add padding to container elements */
.container {
    padding: 16px;
}
/* The Modal (background) */
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
    width: 80%; /* Could be more or less, depending on screen size */
}
/* Style the horizontal ruler */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
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
<center><h1>Automobile Inventory Online</h1></center>
<video id="bgvid" playsinline autoplay muted loop>
 <source src="C:\Users\nayan\Downloads\car.mp4" type="video/mp4">

</video>
<form action="login" method="post">
<div id="car">
<center>LOGIN</center>
<br>
<label><b>EMAIL</b></label>
<input type="text" name="uname" required>
<br>
<br>
<label for="pass"><b>PASSWORD</b></label>
<input type="password" name="pass" required>
<br>
<br>
<input type="submit" value="submit">
<br>
<br>
</div>

</form> 
<right>
<form action="fpwd" method="post">
<input type="submit" value="Forgot Password">
</form>
</right>
<button onclick="document.getElementById('id01').style.display='block'" style="width:auto; top:5; right:3; position:absolute;">Sign Up</button>

<div id="id01" class="modal">
  <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
  <form class="modal-content" name="requestForm" action="func" method="post">
    <div class="container">
    <center>
      <fieldset>
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
      <label for="name"><b>Name&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Name" name=userName required>
      <br><br>
      <label for="email"><b>Email&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Email" name="userEmail" required>
      <br><br>
      <label for="psw"><b>Password&ensp;</b></label>
      <input type="password" placeholder="Enter Password" name="userPassword" required>
      <br><br>
      
      </fieldset>
      </center>
      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="signupbtn">Sign Up</button>
      </div>
    </div>
  </form>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>

</body>
</html>