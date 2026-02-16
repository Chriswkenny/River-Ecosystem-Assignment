package edu.monmouth.ecosystem;

public class Bear extends Animal {
	
	public Bear() {
		super("BEAR", 2);
	}
	
	@Override
	public Animal createOffspring() {
		return new Bear();
	}
	//convert the object to a string for output display
	@Override
	public String toString() {
		return "B";
	}
}
