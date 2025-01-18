package com.neotech.lesson02;

  /*
   * Create a Java program and name it Task1
   a) In your program create the variables to store student's information and 
     then print the value of those variables:
      - name
      - lastName
       - grade
       - city
        - state

          b) Print the following:
         My name is ______ and my lastname is _____.
        I live in the city of _____, state of ____.
        My grade is: ____
        */

public class StringTask {
	public static void main(String[] args) {
		//a)
		String name = "John";
		String lastName = "Doe";
		char grade = 'A';// one character, single quote: ''
		String city = "NYC";
		String state = "NY";
		//b)
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println("I live in the city of " + city  + ", state of " + state + "."); 
		System.out.println("My grade is: " + grade);
		
       System.out.println("-----------------------------------");
		
		//using \n --> it is the same as pressing ENTER (create a new line)
		System.out.println("My name is " + name + " and my last name is " + lastName + ".\n" 
		+ "I live in the city of " + city + ", state of " + state + ".\n" + "My grade is: " + grade);

				
	}

}
