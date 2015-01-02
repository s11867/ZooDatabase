package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Person;
import domain.Function;
import domain.Animal;
import domain.Race;
import repositories.IRepository;
import repositories.IAnimalRepository;

public class AnimalRepository 
	extends Repository<Animal>
	implements IAnimalRepository
{

	public AnimalRepository(Connection connection, IEntityBuilder<Animal> builder) 
	{
		super(connection, builder);
	}

	
	protected void setUpUpdateQuery(Animal entity) throws SQLException 
	{
		update.setString(1, entity.getName());
		update.setString(2, entity.getSpecies());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Animal entity) throws SQLException 
	{	
		update.setString(1, entity.getName());
		update.setString(2, entity.getSpecies());
		
	}

	@Override
	protected String getTableName() 
	{
		return "animals";
	}

	@Override
	protected String getInsertQuery() 
	{
		return "INSERT INTO animals(name,species,race,cage) values(?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() 
	{
		return "update animals set (name,species,race,cage)=(?,?,?,?) where id=?";
	}

	@Override
	public List<Animal> withRace(Race race) 
	{
		return null;
	}

	@Override
	public List<Animal> withRace(String raceName) 
	{
		return null;
	}

	@Override
	public List<Animal> withRace(int raceId) 
	{
		return null;
	}

}
