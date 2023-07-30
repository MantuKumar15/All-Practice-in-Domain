package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean; 
import com.mvc.dao.LoginDao;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("utype");
      PrintWriter out=response.getWriter();
        LoginBean lb = new LoginBean(); 
        lb.setUserName(userName);
        lb.setPassword(password);
        lb.setType(type);
 
        LoginDao ld = new LoginDao(); 
 
        String userValidate = ld.checkUser(lb); 
 
        if(userValidate.equals("SUCCESS"))
         {
        	
             request.setAttribute("userName", userName); 
             request.getRequestDispatcher("/Home.html").forward(request, response);
         }
      
         else
         {
        	  
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/login.html").forward(request, response);
             
         }
    }
}