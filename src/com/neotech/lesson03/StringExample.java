package com.neotech.lesson03;

public class StringExample {

	public static void main(String[] args) { 
	
		
		//primitive date types:   date type  name = value ;
		// byte, short, int, long, float, double, chart, and boolean
		int a; 
		a= 10; 
		int b= 15; 
		char c ='g';// single quote ''
		//non-primitive date types: date type name = value ;
		// What is the type, how do I write it??
		String schoolName = "NeoTech";// double quote""
		String name = "Bello";
		int age = 25;
		String income = "100K";// string not an integer
		String nationality = "Albanian";
		
		System.out.println(schoolName);
		System.out.println(name);
		System.out.println(age);
		System.out.println(income);
		System.out.println(nationality);
		// re-assign nationality
		nationality = "Cuban";
		System.out.println(nationality);
	}
}
