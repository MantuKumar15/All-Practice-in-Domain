package com.servletcontext;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

@WebServlet("/SetAttributeExample")
public class SetAttributeExample extends HttpServlet {
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
String name= request.getParameter("name");
request.setAttribute("Name", name);
ServletContext context= getServletContext();
RequestDispatcher rd= context.getRequestDispatcher("/GetAttributeExample");
rd.forward(request, response);
}

}
