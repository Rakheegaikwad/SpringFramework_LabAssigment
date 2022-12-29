
package com.SpringFrameworks.Entity;

import org.springframework.jdbc.core.JdbcTemplate;


//declaring AgentDao class
public class AgentDao 
{
	  JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//creating createTable method
	public int createTable()
	{
		String query="create table Agent(Agent_id int primary key,Agent_name varchar(25),Agent_commision int)";
		return jdbcTemplate.update(query);
	}
	//creating saveAgent for insert values in Agent Table
	 public int saveAgent(Agent a)
	{
		String query="insert into Agent values('"+a.getAgent_id()+"','"+a.getAgent_name()+"','"+a.getAgent_commision()+"')";
		return jdbcTemplate.update(query);
		
	}
	 //creating updateAgent method for updating  in Agent Table
	 public int updateAgent(Agent a)
		{
			String query="update Agent set Agent_name='"+a.getAgent_name()+"', Agent_commision='"+a.getAgent_commision()+"' where Agent_id='"+a.getAgent_id()+"' "; 
			return jdbcTemplate.update(query);
			
		}
		
	//creating deleteAgent method for deleting row in Agent Table
	public int deleteAgent(Agent a)
	{
		String query="delete from Agent where Agent_id='"+a.getAgent_id()+"' "; 
		return jdbcTemplate.update(query);
		
	}
	
	
}
//end of class AgentDao
