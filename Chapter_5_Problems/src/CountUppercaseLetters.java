/* Create a program that ask the 
 * user to enter a string then 
 * processes the string to find and
 * keep count of all uppercase letters.
 * 1. Prompt the user to enter a string.
 * 2. Use a for-loop to scan the String
 * for uppercase letters (need a counter
 * to store the amount of the uppercase letters)
 * 3. Print the amount of uppercase letters.
 */
import java.util.Scanner;

public class CountUppercaseLetters {

	public static void main(String[] args){
		
		// 1. Prompt user for a string.
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String userString = input.nextLine();
		int counter = 0;// Counter stores the amount of uppercase letters.
		
		// 2. Loop scans the string for any uppercase letters.
		for (int a = 0; a < userString.length(); a++){
	
			// If statement provides a way to separate
			// characters for the counter to accurately compute.
			if (Character.isUpperCase(userString.charAt(a))){
				counter++;
			}
				
		
		}
		
		// 3. Print the count of uppercase letters.
		System.out.println("There are " + counter 
				+ " uppercase letters in your string");

	}
}
