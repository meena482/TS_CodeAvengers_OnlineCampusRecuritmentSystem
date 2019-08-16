 <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

%>
<!DOCTYPE html>
<html>
<body>

  
  

<table border="1">
<tr>
<td>CompanyName</td>
<td>Email</td>
<td>Vacancy</td>

<td>Skills</td>
<td>Address</td>
<td>MobileNo</td><a class="active" href="StudentHomePage.jsp"></a>

</tr>
<%
try{
Connection connection = null;
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection createConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
               System.out.println("result"+createConnection);
Statement st = createConnection.createStatement();
ResultSet rs = st.executeQuery("select * from Postjobs");
              System.out.println("result"+rs);
while(rs.next()){
%>
<tr>
<td><%=rs.getString("CompanyName") %></td>
<td><%=rs.getString("Email") %></td>
<td><%=rs.getString("Vacancy") %></td>

<td><%=rs.getString("Skills") %></td>
<td><%=rs.getString("Address") %></td>
<td><%=rs.getString("MobileNo") %></td>

<td><a href="StudentHomePage.jsp"  class="btn btn-primary a-btn-slide-text mybtn" onclick=callalert()>
                    <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                    <span><strong>Apply</strong></span>          
                </a> </td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>



</table>
<script>
function callalert() {
  alert("Job! applied successfully");

</script>
</body>
</html>