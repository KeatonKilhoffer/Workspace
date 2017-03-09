/* The Addition Quiz Program is designed
 * to display two random positive integers
 * of which the user must input the correct 
 * value of the sum of these integers.
 * 
 */
/* 3.10: (Addition Quiz) 
 * Write a program to produce two positive
 * integers then add them together. 
 * Afterward, take the user input and declare
 * if the input is correct or wrong
 * by comparing it with the sum of the integers.
 */

import java.util.Scanner;

public class AdditionGame {
	public static void main(String[] args){
		//Generate two random integers less than 100
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//Prompt the user to answer "What is number1 - number2"
		System.out.println("What is " + number1 + " + " + number2 + " ? ");
		//Create Scanner
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		/* Compute the answer and compare with
		 * user input then display the results
		 */
		if (number1 + number2 == guess)
			System.out.println("You are correct");
		else {
			System.out.println("Your answer is Wrong");
			System.out.println(number1 + " + " + number2 + " is " + (number1 + number2));
		}
	
	}
}