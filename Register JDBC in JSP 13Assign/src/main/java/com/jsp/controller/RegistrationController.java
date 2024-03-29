package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fullname");
        String userName = request.getParameter("userName");
        String pass = request.getParameter("pass");
        String addr = request.getParameter("address");

        // validate given input
        if (name.isEmpty() || addr.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else {
            // inserting data into mysql(mariadb) database
            // create a test database and student table before running this to create table
            //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
            try {
                Class.forName("org.mysql.jdbc.Driver");
                // loads mysql(mariadb) driver

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4", "root", "Bihar@123");

                String query = "insert into student2 (fullname,userName,pass,address) values (?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(query); // generates sql query

                ps.setString(1, name);
                ps.setString(2, userName);
                ps.setString(3, pass);
                ps.setString(4, addr);
               

                ps.executeUpdate(); // execute it on test database
                System.out.println("successfuly inserted");
                ps.close();
                con.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
        }
    }
}