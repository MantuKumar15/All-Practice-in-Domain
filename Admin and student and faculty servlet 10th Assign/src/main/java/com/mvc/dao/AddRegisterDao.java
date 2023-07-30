package com.mvc.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.bean.AddRegisterBean;
import com.mvc.util.DBConnection;
 
public class AddRegisterDao {
     public String checkUser(AddRegisterBean lb)
     {
         String userName = lb.getUserName(); 
         String password = lb.getPassword();
         String type =lb.getType();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String userNameDB = "";
         String passwordDB = "";
         String typeDB="";
 
         try
         {
             con = DBConnection.createConnection(); 
             statement = con.createStatement();
             resultSet = statement.executeQuery("select userName,password,type from users "); 
 
             while(resultSet.next()) 
             {
              userNameDB = resultSet.getString("userName"); 
              passwordDB = resultSet.getString("password");
              typeDB =resultSet.getString("type");
              
 
               if(userName.equals(userNameDB) && password.equals(passwordDB)&& type.equals(typeDB))
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
