<html>
<head>
<title>login succes page</title>
</head>
<body>
<form action="logoutServlet" method="post" >
<h1>Login Successfully,
<%
out.println(session.getAttribute("user"));


%>
</h1>
<%= s%>
<%!
String s="pra";
public void myMethod()
{
  
}
%>




<a href="abc.jsp">ABC</a></br>
<a href="pqr.jsp">PQR</a></br>
<a href="xyz.jsp">XYZ</a>
<td align="right"><input type="submit" value="LogOut" /></td>

</form>
</body>
</html>
