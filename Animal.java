package edu.monmouth.ecosystem;

public class Animal {
    
	private String type;      
    private int strength;     
    
    //Animal Constructor
    public Animal(String type, int strength) {
        this.type = type;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }
    
    //Check if the animals are the same
    public boolean checkSameSpecies(Animal other) {
        return this.type.equals(other.type);
    }

    public Animal createOffspring() {
        return null;
    }
  //convert the object to a string for output display
    @Override
    public String toString() {
    	return type.substring(0, 1);
    }

}

