/* Write a program that 
 * 1. Prompts the user for an input
 * that is within the range of the
 * card values. input must be an integer.
 * 2. Forces user to restart program
 * if integer is out of range.
 * 3. Matches the input value with the
 * card type and prints results.
 * 4. Matches the input value with the 
 * card suit and prints results.
 * 
 */

import java.util.Scanner;

public class PickACard {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Pick A Card!");
		
		// 1.Prompt user for input
		System.out.print("Enter an integer whose value\n"
				+ "is less than or equal to 52: ");
	
			int number = input.nextInt();
			int newNumber = (number) % 13;
			
			// 2.Print error warning for incorrect input
			if (number > 52 || number < 1)
				System.out.print("Invalid Number!!!!\n"
						+ "Re-run program and try again");
			else{
				/* 3. Using a switch statement assign
				 * each suit to contain a card of 
				 * each type according to 
				 * the standard card deck.
				 */
			switch (newNumber) {
			case 1: System.out.print("The card you picked is Ace "); break;
			case 2: System.out.print("The card you picked is 2 "); break;
			case 3: System.out.print("The card you picked is 3 "); break;
			case 4: System.out.print("The card you picked is 4 "); break;
			case 5: System.out.print("The card you picked is 5 "); break;
			case 6: System.out.print("The card you picked is 6 "); break;
			case 7: System.out.print("The card you picked is 7 "); break;
			case 8: System.out.print("The card you picked is 8 "); break;
			case 9: System.out.print("The card you picked is 9 "); break;
			case 10: System.out.print("The card you picked is 10 "); break;
			case 11: System.out.print("The card you picked is Jack "); break;
			case 12: System.out.print("The card you picked is Queen "); break;
			case 0: System.out.print("The card you picked is King ");
			}
			
			/* 4. Limit range and divide suits
			 * using an if-else statement. */
			
		    if (number > 39)
				System.out.print("of Spades");
			else if (number > 26)
				System.out.print("of Hearts");
			else if (number > 13)
				System.out.print("of Diamonds");
			else 
				System.out.print("of Clubs");
				
	}
	}
}