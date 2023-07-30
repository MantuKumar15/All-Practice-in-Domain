package com.spring;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class StudentDemo 
{ 
public static void main(String[] args) 
{ 
@SuppressWarnings("resource")
ApplicationContext appCon=new ClassPathXmlApplicationContext("student.xml"); 
StudentBean factory=(StudentBean)appCon.getBean("StudentBean"); 
factory.displayInfo(); 
} 
}
