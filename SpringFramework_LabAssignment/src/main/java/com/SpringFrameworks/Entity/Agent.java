package com.SpringFrameworks.Entity;



public class Agent 
{
	//declaring instance variable
	
	private int Agent_id;
	private String Agent_name;
	private int Agent_commision;
	

	//no argument constructor
	public Agent() {
		
	}
	//parameterized all argument constructor
	public Agent(int agent_id, String agent_name, int agent_commision) {
		
		Agent_id = agent_id;
		Agent_name = agent_name;
		Agent_commision = agent_commision;
	}

	//getter and setter
	public int getAgent_id() {
		return Agent_id;
	}
	public void setAgent_id(int agent_id) {
		Agent_id = agent_id;
	}
	public String getAgent_name() {
		return Agent_name;
	}
	public void setAgent_name(String agent_name) {
		Agent_name = agent_name;
	}
	public int getAgent_commision() {
		return Agent_commision;
	}
	public void setAgent_commision(int agent_commision) {
		Agent_commision = agent_commision;
	}

	
	public Agent(int agent_id) {
		super();
		Agent_id = agent_id;
	}
	
	
	
	
	
	
}
