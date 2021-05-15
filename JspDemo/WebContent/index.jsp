<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome to jsp
 	<%! static int count=0; %>
 	<%
 	int a=10;
 	out.println(a);
 	%><br>
 	<%!
 	int b=10;
 	int c=13;
 	%>
 	<br>
 	sum is:<%=b+c %>
 	<br>
 	Date and Time:<%=new java.util.Date() %>
 	<br>
 	Number of times you hit this page:<%=count++ %>
</body>
</html>