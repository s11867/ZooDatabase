package repositories;

import domain.*;

import java.util.List;

public interface IAnimalRepository extends IRepository<Animal>
{
	public List<Animal> withRace(Race race);
	public List<Animal> withRace(String raceName);
	public List<Animal> withRace(int raceId);
}
