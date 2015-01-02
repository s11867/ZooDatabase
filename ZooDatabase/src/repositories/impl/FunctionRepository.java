package repositories.impl;

import java.util.List;

import domain.Function;
import repositories.IRepository;

public class FunctionRepository implements IRepository<Function>{

	private DummyDb db;
	
	public FunctionRepository(DummyDb db) 
	{
		super();
		this.db = db;
	}

	@Override
	public void save(Function entity) 
	{
		db.functions.add(entity);
		
	}

	@Override
	public void update(Function entity) 
	{

		
	}

	@Override
	public void delete(Function entity) 
	{
		db.functions.remove(entity);
	}

	@Override
	public Function get(int id) 
	{		
		for(Function function : db.functions)
			if(function.getId()==id)
				return function;
		return null;
	}

	@Override
	public List<Function> getAll() 
	{
		return db.functions;
	}

}
