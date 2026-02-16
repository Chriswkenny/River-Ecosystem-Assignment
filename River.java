package edu.monmouth.ecosystem;

import java.util.Random;

public class River {
		private Animal[] river;
		private Random rd;
	
	//Constructor
	public River(int size) {
		river = new Animal[size];		
		rd = new Random();
	}
	
	//Add an animal to the river
	public void addAnimal(Animal animal, int position) {
		//ensure position is not filled
		if(position >= 0 && position < river.length) {
			river[position] = animal;
		}
	}
	
	//Simulate the movement of animals in the array
	public void moveAnimal() {
		for(int i = river.length-1; i >= 0; i--) {
			
		//Ensure array index is empty
			if(river[i] == null) {
				continue;
			}
			Animal current = river[i];
			int direction = rd.nextBoolean() ? -1:1; //determines randomly if it moves left (-1) or right (1)
			int target = i + direction;
		//Ensure the movement is within the array bounds
			if(target < 0 || target >= river.length){ 
				continue;
			}
		//move animal to empty cell
			if(river[target] == null) {
				river[target] = current;
				river[i] = null;
			}
		//Species are different		
			else {
				Animal other = river[target];
				
			if(current.checkSameSpecies(other)) {
				Animal baby = current.createOffspring();
				int empty = findEmpty();
				
				if(empty != -1) {
					river[empty] = baby;
				}
			} else {
				if(current.getStrength() > other.getStrength()) {
					river[target] = current;
					river[i] = null;
				}
			}
		}	
	}
}
	//Method for placing newly created animal in array
	private int findEmpty() {
		for(int j = 0; j < river.length; j++) {
			if(river[j] == null) {
				return j;
			}
		}
		return -1;
	}
	
	//Method for displaying the river to ensure code works
	public void display() {
		for (Animal a : river) {
			if(a == null) {
				System.out.print("_");
			}
			else {
				System.out.print(a);
			}
		}
		System.out.println();
	}
}	

