<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userinfo" class="com.jsp.view.Details"></jsp:useBean> 
<jsp:setProperty property="*" name="userinfo"/> 
You have enterted below details:<br> 
<jsp:getProperty property="username" name="userinfo"/><br> 
<jsp:getProperty property="password" name="userinfo"/><br> 
<jsp:getProperty property="age" name="userinfo" /><br>

</body>


</html>