package com.neotech.lesson03;

public class ArithmeticOperationsTask {
	/*1. Write a java program to display the area and perimeter
	of a circle that has a radius of 5. Use pi = 3.
	Area = pi * radius * radius
	Perimeter = 2 * pi * radius
	*/
       public static void main(String[] args) {
        	  
       int r, pi, A, P;
       r = 5;
       pi = 3;
       
       A = pi * r * r;
       System.out.println("area--> " + A);
       P = 2 * pi * r;
       System.out.println("perimeter--> " + P);
       
       /*
		 2. Write a java program that converts mile to km and km to miles.
			Use scale 1 mile = 1.609344.
			Print the conversion on the console.
			For example: 10 miles is 16.09344 kilometers
		 
		 */
		
			//Most useful formula in Java!!!
		// dataType 	identifier (name) 	assignment op (=) 	value ;
		
		//just declaring a variable
		//dataType identifier;
		
		double scale = 1.609344;
		
		
		double km, mile, km2, mile2; //declaring multiple variables of the same type
		
		
		mile = 5; 
		km = mile * scale; //5 * 1.609344
		
		System.out.println(mile + " miles is " + km + " kilometers.");
		
		System.out.println("--------------------------------------");
		
		km2 = 60;
		mile2 = km2/scale;
		
		System.out.println(km2 + " kilometers is " + mile2 + " miles.");
		
		
		
		
		
		
			
       
        
       
        
       
       
       
       
       
          }

}
