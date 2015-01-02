package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Function;
import domain.Employee;
import repositories.IRepository;
import repositories.IEmployeeRepository;

public class DummyEmployeeRepository implements IEmployeeRepository {

	private DummyDb db;
	
	public DummyEmployeeRepository(DummyDb db) 
	{
		this.db = db;
	}

	@Override
	public void save(Employee entity) 
	{
		db.employees.add(entity);
	}

	@Override
	public void update(Employee entity) 
	{
		
	}

	@Override
	public void delete(Employee entity) 
	{
		db.employees.remove(entity);
	}

	@Override
	public Employee get(int id) 
	{
		for(Employee u: db.employees)
		{
			if(u.getId()==id)
			{
				return u;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAll() 
	{
		return db.employees;
	}

	@Override
	public List<Employee> withFunction(Function function) 
	{
		return withFunction(function.getId());
	}

	@Override
	public List<Employee> withFunction(String functionName) 
	{

		for(Function r: db.functions)
		{
			if(r.getName()==functionName)
			{
				return r.getEmployees();
			}
		}
		
		return new ArrayList<Employee>();
	}

	@Override
	public List<Employee> withFunction(int functionId) 
	{
		
		for(Function r: db.functions)
		{
			if(r.getId()==functionId)
			{
				return r.getEmployees();
			}
		}
		
		return new ArrayList<Employee>();
	}

}
