package NestedifelseStstement;

public class Example4 {

	public static void main(String[] args) {
	
		int i=10;
		if(i==10) {
		//First if statement
		if(i<15)
		System.out.println("i is smaller than 15");
		// Nested if statement
		// will only be executed if statement above it is true
		if(i<20)
		System.out.println("i is smaller than 20 too");
		else
		System.out.println("i is greater than 15");
		
		}
		
	}

}
