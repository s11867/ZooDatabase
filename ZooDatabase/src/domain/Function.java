package domain;

import java.util.*;

public class Function extends Entity  {

	private String name;
	private List<Employee> employees;
	
	public Function()
	{
		employees = new ArrayList<Employee>();
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<Employee> getEmployees() 
	{
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) 
	{
		this.employees = employees;
	}
	
	
	
}
