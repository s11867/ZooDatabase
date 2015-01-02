package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Animal;

public class AnimalBuilder implements IEntityBuilder<Animal> 
{
	
	@Override
	public Animal build(ResultSet rs) throws SQLException 
	{
		Animal animal = new Animal();
		animal.setId(rs.getInt("id"));
		animal.setName(rs.getString("name"));
		animal.setSpecies(rs.getString("species"));
		return animal;
	}
	
}
