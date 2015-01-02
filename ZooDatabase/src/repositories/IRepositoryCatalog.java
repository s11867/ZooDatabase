package repositories;

import domain.*;

public interface IRepositoryCatalog 
{
	public IEmployeeRepository getUsers();
	public IRepository<Person> getPersons();
	public IRepository<Function> getFunctions();
	public IRepository<Animal> getAnimals();	
}
