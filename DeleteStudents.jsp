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
               




                

<form action="AdminHomePage.jsp"  method="post" name="DeleteStudents">

<table cellpadding="2" width="20%" bgcolor="white" align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>DeleteStudentDetails</b></font></center>
</td>
</tr>

<tr>
<td>StudentId</td>
<td><input type=text name=StudentId id="StudentId" size="30"></td>
</tr>
<td colspan="2"><input type="submit" value="Delete" onclick=callalert()></td>
<a href="AdminHomePage.jsp"></a>
</tr>
</table>
</form>
<script>
function callalert() {
  alert("Deleted successfully");
}
</script>
</body>
</html>

