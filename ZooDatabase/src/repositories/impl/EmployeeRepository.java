package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Person;
import domain.Function;
import domain.Employee;
import repositories.IRepository;
import repositories.IEmployeeRepository;

public class EmployeeRepository 
	extends Repository<Employee>
	implements IEmployeeRepository
{

	public EmployeeRepository(Connection connection, IEntityBuilder<Employee> builder) 
	{
		super(connection, builder);
	}

	
	protected void setUpUpdateQuery(Employee entity) throws SQLException 
	{
		update.setString(1, entity.getJobTitle());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Employee entity) throws SQLException 
	{	
		insert.setString(1, entity.getJobTitle());
		
	}

	@Override
	protected String getTableName() 
	{
		return "employees";
	}

	@Override
	protected String getInsertQuery() 
	{
		return "INSERT INTO employees(jobtitle) values(?)";
	}

	@Override
	protected String getUpdateQuery() 
	{
		return "update employees set (jobtitle)=(?) where id=?";
	}

	@Override
	public List<Employee> withFunction(Function function) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> withFunction(String functionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> withFunction(int functionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
