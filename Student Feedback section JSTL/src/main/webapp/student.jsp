<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Feedback Section</title>

<style>
body{
width: 800px;
height: 400px;
margin-top: 120px;
margin-left: 300px;
border-radius: 15px;
background-color: coral;
}

form{
width: 800px;
height: 400px;
background-color: white;
border-radius: 15px;
}
#hh{
background-color: blue;
border-top: 15px;
text-align: center;
color: yellow;

}

#box{
width: 200px;
height: 25px;
margin-top:20px;
border: 1px solid black;
border-radius: 5px;

}
#box1{
width: 200px;
height: 25px;
margin-top:25px;
border: 1px solid black;
border-radius: 5px;
}
#box2{
width: 200px;
height: 30px;
border-radius: 5px;
margin-top: 30px;

}
#box3{
width: 200px;
height: 30px;
border-radius: 5px;
margin-top: 30px;
border: 1px solid black;

}
#box4{
width: 200px;
height: 25px;
margin-top: 30px;
border: 1px solid black;
border-radius: 5px;
}
#box5{
width: 200px;
height: 25px;
margin-top: 30px;
border: 1px solid black;
border-radius: 5px;
}
#box6{
width: 100px;
height: 25px;
margin-top: 70px;
margin-left: 250px; 
border-radius: 5px;
color: white;
border: none;
background-color: blue;
}
#box7{
width: 100px;
height: 25px;
margin-top: 70px;
margin-left:70px;
border-radius: 5px;
border: none;
color: white;
background-color: red;
}


</style>

</head>
<body>
<div>
<form action="studentdatabase.jsp" method="post">
<h1 id="hh">Student Feedback</h1>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Student Name:&nbsp;&nbsp;<input id="box" type="text" placeholder="Enter Name"/>&nbsp;&nbsp;&nbsp;&nbsp;
<span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Reg_No:&nbsp;&nbsp;<input id="box1" type="text" placeholder="Enter Reg_No."/><br><br> 
</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Branch:&nbsp;&nbsp;
<select id="box2"><option selected="selected"> --Select--    </option>
  <option value="ece">CSE</option>
  <option value="ece">ECE</option>
  <option value="civil">Civil</option>
  <option value="bba">BBA</option>
  </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  
  <span>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Semester:&nbsp;&nbsp;<select id="box3"><option selected="selected">  --Select--    </option>
  <option>1st</option>
  <option>2nd</option>
  <option>3rd</option>
  <option>4th</option>
  <option>5th</option>
  <option>6th</option>
  <option>7th</option>
  <option>8th</option>
  </select><br><br>
  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Subject:&nbsp;&nbsp;<input id="box4" type="search" placeholder="Enter Subject name"/>
  </span>
  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Faculty:&nbsp;&nbsp;
  <input id="box5" type="text" placeholder="Enter Name"/><br>
 <span>
<input id="box6" type="submit" value="Submit"/>
</span>
<input id="box7" type="submit" value="Clear"/><br>
</form>
</div>
</body>
</html>