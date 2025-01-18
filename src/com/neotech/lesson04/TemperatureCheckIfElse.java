package com.neotech.lesson04;

public class TemperatureCheckIfElse {

	public static void main(String[] args) {
		
		/* 2. Create a Java program and name it TemperatureCheck.
		Create a variable to store temperature.
		Your program should check if the temperature is below 32
		If the temperature is below 32
		    then it should print "Water will freeze with temperature __",
		    otherwise should print "Water will NOT freeze with temperature __"*/
		
		int temp1 = 10;
		int temp0 = 32;
		
		if (temp1 < temp0)
		{
			System.out.println("water will freeze with temperature " + temp1);
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature " + temp0);
		}
	}

}
