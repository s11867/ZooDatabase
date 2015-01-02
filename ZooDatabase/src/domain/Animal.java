package domain;

public class Animal extends Entity {

	public Animal() {
		
	}
	
	private String name;
	private String species;
	private Race race;
	private Cage cage;
	
	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public Race getRace() {
		return race;
	}
	
	public void setRace(Race race) {
		this.race = race;
	}

}
