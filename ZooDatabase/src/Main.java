import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import domain.*;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;
import repositories.impl.EmployeeRepository;


public class Main {

	public static void main(String[] args) {
		
		String url ="jdbc:hsqldb:hsql://localhost/zoodb";
		
		Employee employee1 = new Employee();
		employee1.setJobTitle("feeder");

		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			IRepository<Employee> employees = new EmployeeRepository(connection,null);
			
			employees.save(employee1);
			
			List<Employee> employeesFromDb = employees.getAll();
			
			for(Employee employeeFromDb : employeesFromDb)
			{
				System.out.println(employeeFromDb.getId()+" "+employeeFromDb.getJobTitle());
			}
			
			Employee employee = employees.get(1);
			
			employees.update(employee);
			
			employees.delete(employeesFromDb.get(0));
			
			for(Employee employeeFromDb : employees.getAll())
			{
				System.out.println(employeeFromDb.getId()+" "+employeeFromDb.getJobTitle());
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("End of program execution...");
	}

}
