package com.neotech.lesson05;

public class TaskNestedIfCondition {
	/*
	 * Create a Java program to check if it is Friday or not. If it is Friday, print
	 * "It's Friday. I am going to watch a movie!" and check the date, if date is 13
	 * print "I will watch a scary movie.". If date is not 13 print "I will watch a
	 * comedy.". If it is not Friday, print "It is NOT Friday. I am going to study
	 * JAVA."
	 */

	public static void main(String[] args) {

		// if it is Friday --> "It’s Friday. I am going to watch a movie."
		// if the date is 13 --> “I will watch a scary movie.”
		// else (date is NOT 13) --> “I will watch a comedy.”
		// else (it is NOT Friday) --> “It is NOT Friday. I am going to study JAVA.”

		boolean isFriday = true;
		int date = 15;
        //NestedIfCondition
		if (isFriday) //outer if
		{
			System.out.println("It’s Friday. I am going to watch a movie.");

			if (date == 13) //inner if
			{
				System.out.println("I will watch a scary movie.");
			} 
			else //inner else
			{	
				System.out.println("I will watch a comedy.");
			}
		} 
		else //outer else
		{
			System.out.println("It is NOT Friday. I am going to study JAVA.");
		}

		// Let's add another inner condition
		// if the date is 15, I will watch a thriller

		if (isFriday) //outer if
		{
			System.out.println("It’s Friday. I am going to watch a movie.");

			if (date == 13) //inner if
			{
				System.out.println("I will watch a scary movie.");
			}
			else if (date == 15)
			{
				System.out.println("I will watch a thriller.");
			} 
			else //inner else
            {
				System.out.println("I will watch a comedy.");
			}
		} 
		else //outer else
        { 
			System.out.println("It is NOT Friday. I am going to study JAVA.");
		}
	}

}