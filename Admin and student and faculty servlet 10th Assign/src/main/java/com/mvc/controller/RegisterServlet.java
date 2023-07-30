package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.RegisterBean; 
import com.mvc.dao.RegisterDao;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String type = request.getParameter("utype");
        PrintWriter out=response.getWriter();
        RegisterBean lb = new RegisterBean(); 
        lb.setFirstName(firstName);
        lb.setLastName(lastName);
        lb.setUsername(username);
        lb.setPassword(password);
        lb.setContact(contact);
        lb.setAddress(address);
        lb.setType(type);
 
        RegisterDao ld = new RegisterDao(); 
 
        String userValidate = ld.checkUser(lb);  
 
        if(userValidate.equals("SUCCESS"))
         {
             request.setAttribute("UserName", username); 
             request.getRequestDispatcher("/Register.html").forward(request, response);
         }
         else
         { 
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/AddRegister.html").forward(request, response); 
         }
    }
}