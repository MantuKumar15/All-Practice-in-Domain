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
<c:set var="n" value="${10}"></c:set><br>
<c:set var="n1" value="${10}"></c:set>
<c:set var="n2" value="${n+n1}"></c:set>
<c:out value=" Addition of two Number: ${n2}"></c:out>



</body>
</html>