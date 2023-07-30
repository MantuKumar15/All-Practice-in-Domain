<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test1"  
     user="root"  password=""/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students; 
</sql:query>  
<c:out value="Login Successefully" ></c:out>
   
<table border="2" width="20%">  
<tr>  
  
<th>User Name</th>  
<th>Password</th>   
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.username}"/></td>  
<td><c:out value="${table.Password}"/></td>    
</tr>  
</c:forEach>  
</table>  

</body>  
</html>  