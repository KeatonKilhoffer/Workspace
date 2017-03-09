/* Creat a program that:
 * 1. Generates two random integers.
 * 2. Displays and adds the integers 
 * in an addition expression.
 * 3. Prompts the user for the proper
 * answer to the expression.
 * 4. Compares the user input with
 * the correct answer to the expression and
 * tells the user if they are right or wrong.
 * 
 */

import java.util.Scanner;//created to receive user input later

public class AdditionGameSingleRound {
	public static void main(String[] args){
	
		//1. Generate two random integers
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//2. Display and add integers in addition expression.
		System.out.print("What does " + number1 + " + " + number2 + " = ");
		int addition = number1 + number2;
		
		//3. Prompt user for input
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//Compare answers and alert user of results
		if (answer == addition)
			System.out.print("You are correct! " + answer + " = " + addition);
		else {
			System.out.print("You are Wrong. " + answer + " does not equal " + addition);
		}
		}
		
}

