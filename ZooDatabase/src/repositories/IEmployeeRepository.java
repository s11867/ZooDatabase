package repositories;

import java.util.List;

import domain.*;

public interface IEmployeeRepository extends IRepository<Employee>
{
	public List<Employee> withFunction(Function function);
	public List<Employee> withFunction(String functionName);
	public List<Employee> withFunction(int functionId);
}
