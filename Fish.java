package edu.monmouth.ecosystem;

public class Fish extends Animal {
	public Fish() {
		super("FISH", 1);
	}
	
	@Override
	public Animal createOffspring() {
		return new Fish();
	}
	//convert the object to a string for output display
	@Override
	public String toString() {
		return "F";
	}
}
