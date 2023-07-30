<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
First Name:<c:out value="${param.firstName}"></c:out><br/> 
Last Name:<c:out value="${param.lastName}"></c:out> 
</body>
</html>