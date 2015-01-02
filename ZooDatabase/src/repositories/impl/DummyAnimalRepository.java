package repositories.impl;

import java.util.List;

import repositories.IRepository;
import domain.Animal;

public class DummyAnimalRepository implements IRepository<Animal> {
	
	private DummyDb db;
	
	public DummyAnimalRepository(DummyDb db)
	{
		super();
		this.db = db;
	
	}

	@Override
	public void save(Animal entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Animal entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Animal entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Animal get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Animal> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
