package edu.monmouth.ecosystem;

public class Ecosystem{

	    public static void main(String[] args) {
	        River river = new River(20);

			//check if fish create new fish
			//river.addAnimal(new Fish(), 3);
	       	//river.addAnimal(new Fish(), 4);
			//river.addAnimal(new Fish(), 5);
			//river.addAnimal(new Fish(), 6);
			
	        //check if bear eats fish and bears create new bear
	        river.addAnimal(new Bear(), 3);
	        river.addAnimal(new Bear(), 19);
	        river.addAnimal(new Bear(), 14);
	        river.addAnimal(new Fish(), 17);
	        river.addAnimal(new Fish(), 20);
	        river.addAnimal(new Fish(), 4);
	        river.addAnimal(new Bear(), 7);
	        river.addAnimal(new Bear(), 9);
	        river.addAnimal(new Fish(), 1);
	        river.addAnimal(new Fish(), 2);
	        river.addAnimal(new Fish(), 8);
	        
	        System.out.println("Initial River:");
	        river.display();
	        
	        
	        for (int step = 1; step <= 5; step++) {
	            river.moveAnimal();
	            System.out.println("Step " + step + ":");
	            river.display();
	        }
	    }
	}
	    



	


