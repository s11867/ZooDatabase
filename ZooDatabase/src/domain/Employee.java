package domain;

import java.util.*;

public class Employee extends Entity  {

	private String jobTitle;
	private Person person;
	private List<Function> functions;
	
	public Employee()
	{
		functions = new ArrayList<Function>();
	}
	
	public List<Function> getFunctions() 
	{
		return functions;
	}
	
	public void setFunctions(List<Function> functions) 
	{
		this.functions = functions;
	}
	
	public String getJobTitle() 
	{
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}
	
	public Person getPerson() 
	{
		return person;
	}
	
	public void setPerson(Person person) 
	{
		this.person = person;
	}	
}
