package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.AddRegisterBean; 
import com.mvc.dao.AddRegisterDao;
/**
 * Servlet implementation class AddRegisterServlet
 */
@WebServlet("/AddRegisterServlet")
public class AddRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("utype");
        PrintWriter out=response.getWriter();
        AddRegisterBean lb = new AddRegisterBean(); 
        lb.setUserName(userName);
        lb.setPassword(password);
        lb.setType(type);
 
        AddRegisterDao ld = new AddRegisterDao(); 
 
        String userValidate = ld.checkUser(lb); 
 
        if(userValidate.equals("SUCCESS"))
         {
        	
             request.setAttribute("userName", userName); 
             request.getRequestDispatcher("/login.html").forward(request, response);
         }
      
         else
         {
        	  
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/AddRegister.html").forward(request, response);
             
         }
    }
}