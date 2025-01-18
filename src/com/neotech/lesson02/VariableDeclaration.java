package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//Data Type     Name/Identifier     Operator (=)    value
		
		//1st way to declare and assign
		int number = 25;  //declaring and assigning a value
		//2nd way
		   //we declare  first, then assign before we use the variable
		int number2; // I have and int variable called number2
		//this cause a compiler error -> number value is not given
		//system.out.println();
		number2 = 20;
		System.out.println(number2);
		
		//we can declare  multiple variables in one line
		
		char var1, var2, var3;
		
		// the upper declaration is exactly the same  as:
		//char var1;
		//char var2;
		//char var3;
		
		var1 = '@';
		var2 = '#';
		var3 = '!';
		
		System.out.println(var1);    //At this point var1 =@
		//I will re-assign a value to var1
		var1= '$';
		System.out.println(var1);    //at this point var1 = $
		
		//Can I re-assign a value to number2? Yes!
		number2 = 50;
		System.out.println(number2);
		
		
		
	}

}
