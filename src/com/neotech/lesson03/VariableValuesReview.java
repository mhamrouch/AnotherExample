package com.neotech.lesson03;

public class VariableValuesReview {
	/*
	 *Create a Java program and name it VariableValues
      In your program create variables to store all different types of primitive data.
      Print the value of each variable.
      Update value of each variable.
      Print the value of each variable after updating.
      */

	public static void main(String[] args) {
		
		// how I declare a variable???
		// Data Type        Name/identifier
		// how do i declare and  assign value to a variable    
		//DateType  Name/Identifier  Assignment Operator (=) Value;
		
		byte A = 10; //-128 to 127
		short B = 250; //-32768 to 32767
		int C = 2500; //-2147483648 to 2147483647
		long D = 23453453L; //-9223372036854775808 to 9223372036854775807
		float E = 23.5F;// decimal, 0.14012985e-44 to 0.34028235e39. half size of  double
		double F = 55.4;// decimal, .11125369292536009e-307 to .17976931348623155e+309 
		char   G = '$'; // character, 0 ('\u0000') to 65535 ('\uffff')
		boolean H = false; //0 (false) or 1 (true)
		
		//printing variables
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);
		System.out.println(H);
		
		// can I change the values of the parameters???
		// yes, we call this re-assigning
		
		A = 25;
		B = 50;
		C = 35000;
		D = 123453434L;
		E = 3453F;
		F = 5;
		G = '5';// char is a character and only one character(in the current is not a numerical number) 
		H = true;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);
		System.out.println(H);
	}

}
