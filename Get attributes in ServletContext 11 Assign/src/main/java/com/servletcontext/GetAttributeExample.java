package com.servletcontext;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/GetAttributeExample")
public class GetAttributeExample extends HttpServlet {
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out= response.getWriter();
if(request.getAttribute("Name").equals("Mantu Kumar"))
{
out.println("Valid user");
}
else
{
out.println("Invalid user");
}
}


}