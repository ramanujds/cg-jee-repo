<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
<%
String email=request.getParameter("emailtxt");
%>

<div class="container">
<div class="row">
<div class="col-12">

<h2>Hello World!</h2>

<h3><%=new java.util.Date() %></h3>

<h3 style="color:blue">

Email : <%=email %>

</h3>

</div>

</div>

</div>



</body>
</html>