package domain;

import java.util.ArrayList;
import java.util.List;

public class Person extends Entity  
{
	public Person()
	{
		this.addresses=new ArrayList<Address>();
	}
	
	private String firstName;
	private String surname;
	private String pesel;
	
	private Employee employee;
	private List<Address> addresses;
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	
	public String getPesel() 
	{
		return pesel;
	}
	
	public void setPesel(String pesel) 
	{
		this.pesel = pesel;
	}
	
	public Employee getEmployee() 
	{
		return employee;
	}
	
	public void setUser(Employee employee) 
	{
		this.employee = employee;
	}
	
	public List<Address> getAddresses() 
	{
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses) 
	{
		this.addresses = addresses;
	}	
}
