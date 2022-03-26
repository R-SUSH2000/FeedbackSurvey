<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Object obj1=request.getAttribute("fname");
	if(obj1==null){%>
		<h4>object is null</h4>
		<%}else{
			String nam=(String) obj1;
		%>
		<H1> welcome <%=nam %></H1>	
		<% }%>

</body>
</html>