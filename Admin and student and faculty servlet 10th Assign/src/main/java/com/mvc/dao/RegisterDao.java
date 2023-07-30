package com.mvc.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;
 
public class RegisterDao {
     public String checkUser(RegisterBean lb)
     {
         String firstName = lb.getFirstName();
         String lastName = lb.getLastName();
         String username = lb.getUsername();
         String password = lb.getPassword();
         String address = lb.getAddress();
         String contact = lb.getContact();
         String type =lb.getType();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         try
         {
             con = DBConnection.createConnection(); 
             statement = con.createStatement();
             resultSet = statement.executeQuery("insert into users (firstName,lastName,userName,password,address,contact,type) values (?,?,?,?,?,?,?)"); 
 
             while(resultSet.next()) 
             {   
            	 String firstNameDB = resultSet.getString("firstName");
            	 String lastNameDB = resultSet.getString("lastName");
            	 String userNameDB = resultSet.getString("username");
            	 String passwordDB = resultSet.getString("password");
            	 String addressDB = resultSet.getString("address");
            	 String contactDB = resultSet.getString("contact");
            	 String typeDB =resultSet.getString("type");
              
 
               if(firstName.equals(firstNameDB) && lastName.equals(lastNameDB) && username.equals(userNameDB) && password.equals(passwordDB)&& address.equals(addressDB)&& contact.equals(contactDB)&& type.equals(typeDB))
               {
                  return "SUCCESS"; 
               }
               
             }
             return "wrong credentials";
            
             
         }
             catch(SQLException e)
             {
                e.printStackTrace();
             }
             return "Invalid user credentials"; 
         }
     }
