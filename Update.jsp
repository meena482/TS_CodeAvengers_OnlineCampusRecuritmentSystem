<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body, html {
  height: 100%;
  margin: 0;
}

.a {
        width:30%;
        margin-left:450px;
}



.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
<body>
               <div class="a">
                                 <img src="s.jpg"  style="width:100%;">
               </div>
               




                

<form action="AdminHomePage.jsp"  method="post" name="AddStudentDetails" onsubmit="return(validate());">

<table cellpadding="2" width="20%" bgcolor="white" align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>AddStudentDetails</b></font></center>
</td>
</tr>

<tr>
<td>StudentId</td>
<td><input type=text name=StudentId id="StudentId" size="30"></td>
</tr>

<tr>
<td>StudentName</td>
<td><input type="text" name="StudentName" id="StudentName"
size="30"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="Password" name="Password" id="Password" size="30"></td>
</tr>




<tr>
<td>CPGA</td>
<td><input type="text" name="CPGA" id="CPGA" size="30"></td>

</tr>
<tr>
<td>Skills</td>
<td><input type="text" name="Skills" id="Skills" size="30"></td>

</tr>
<tr>
<td>Email</td>
<td><input type="text" name="Email" id="Email" size="30"></td>
</tr>

<tr>
<td>MobileNo</td>
<td><input type="text" name="mobileno" id="mobileno" size="30"></td>
</tr>
<tr>
<td><input type="reset"></td>
<td colspan="2"><input type="submit" value="Update" /></td>
<a href="AdminHomePage.jsp"></a>
</tr>
</table>
</form>
</body>
</html>