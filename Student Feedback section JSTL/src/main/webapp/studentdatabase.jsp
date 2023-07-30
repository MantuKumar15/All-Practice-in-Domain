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
     url="jdbc:mysql://localhost/sdtfeedback"  
     user="root"  password=""/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Student1; 
</sql:query>  
<c:out value="Feedback Successefully" ></c:out>
   
   
<table border="2" width="30%">  
<tr>  
  
<th>Student Name</th>  
<th>Reg_No</th> 
<th>Branch</th>
<th>Semester</th> 
<th>Subject</th> 
<th>Faculty</th>    
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.student_name}"/></td>  
<td><c:out value="${table.reg_no}"/></td>
<td><c:out value="${table.branch}"/></td>
<td><c:out value="${table.semester}"/></td>  
<td><c:out value="${table.subject}"/></td>  
<td><c:out value="${table.faculty}"/></td>      
</tr>  
</c:forEach>  
</table>  

</body>  
</html>  