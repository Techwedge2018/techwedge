<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Updation here</title>
<style>
body {
  margin: 0;
  background: #000; 
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
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 80%; /* Could be more or less, depending on screen size */
}
.container {
    padding: 16px;
}
.cancelbtn, .upbtn {
  float: left;
  width: 50%;
}
.clearfix::after {
    content: "";
    clear: both;
    display: table;
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

<h4>Please fill in the Profile Details:</h4>
    <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
  
 <form class="modal-content" name="Profile" action="concDetails" method="post">
    <div class="container">
    <center>
      <fieldset>
      <h1>Profile Update</h1>
      <p>Please fill in this form to update profile.</p>
      <hr>
      <label for="cno"><b>Contact Number&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Contact Number" name=phno1 required>
      <br><br>
      <label for="acno"><b>Alternate Contact Number&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Contact Number" name=phno2 >
      <br><br>
      <label for="acno"><b>Alternate e-mail&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter e-mail" name=mail2 >
      <br><br>
      <label for="addr"><b>Address&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Address" name=address1 required>
      <br><br>
      <label for="addrs"><b>Address&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter Address" name=address2 required>
      <br><br>
      <label for="city"><b>City&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&nbsp;&ensp;&ensp;&ensp;&nbsp;&nbsp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter city name" name=city required>
      <br><br>
      <label for="country"><b>Country&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></label>
      <input type="text" placeholder="Enter country name" name=country required>
      <br><br>
      
      
      </fieldset>
      </center>
      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="upbtn">Update</button>
      </div>
    </div>
  </form>

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