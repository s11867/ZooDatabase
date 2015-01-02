package repositories.impl;

import domain.Person;
import domain.Function;
import domain.Animal;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IEmployeeRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IEmployeeRepository getUsers() 
	{
		return new DummyEmployeeRepository(db);
	}

	@Override
	public IRepository<Person> getPersons() 
	{
		return new DummyPersonRepository(db);
	}

	@Override
	public IRepository<Function> getFunctions() 
	{
		return new FunctionRepository(db);
	}
	
	@Override
	public IRepository<Animal> getAnimals() 
	{
		return new DummyAnimalRepository(db);
	}

}
