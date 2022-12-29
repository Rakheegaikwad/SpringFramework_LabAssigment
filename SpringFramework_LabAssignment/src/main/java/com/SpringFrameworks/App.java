/*
Lab Assessment 12
@Name : Rakhee Gaikwad
@Date : 29 Dec 2022
Program :Create Agent table with Agent I'd, agent name, agent commission (salary)
and perform crud operation using spring framework.make program using seperate Dao layer
*/


package com.SpringFrameworks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFrameworks.Entity.Agent;
import com.SpringFrameworks.Entity.AgentDao;

//declaring  App class 
public class App 
{
	//calling main method
	 public static void main( String[] args )
{
	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
	AgentDao dao=(AgentDao) ap.getBean("e2");
	//calling create method and creating table into my sql
	dao.createTable();
	//printing
	System.out.println("Table is created Successfully");
	//Performing crud Operation Insert , update ,Delete
	
	//inserting values into Agent Table
	System.out.println(dao.saveAgent(new Agent(201,"Akshay",20000)));
	System.out.println(dao.saveAgent(new Agent(202,"Rakesh",25000)));
	System.out.println(dao.saveAgent(new Agent(203,"Shahru",32000)));
	System.out.println(dao.saveAgent(new Agent(204,"Pritam",39000)));
	System.out.println(dao.saveAgent(new Agent(205,"Mayur",47000)));
	
	
	//updating values into Agent Table
	System.out.println(dao.updateAgent(new Agent(202,"Rakesh",31000)));
	
	//Deleting row in table Agent
	System.out.println(dao.deleteAgent(new Agent(201,"Akshay",20000)));

	
}
	 //end of main method
}
//end of App class