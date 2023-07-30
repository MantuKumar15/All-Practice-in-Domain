<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int count=0;
int i;
%>
<c:forEach var="person" items="${personlist }">
<tr><td>${person.name}<td><td>${person.age}</td><tr>
</c:forEach>



</body>
</html>