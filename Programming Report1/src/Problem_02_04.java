/*2.6: (Sum the digits in an integer) 
 * Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. 
 * For example, if an integer is 932, the
 * sum of all its digits is 14.
 * 
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * Here is a sample run: 
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
*/
import java.util.Scanner;

public class Problem_02_04 {
	public static void main(String[] args){
		//System design for:
		//(Sum the digits in an integer)
		//Create scanner object for input later
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		
		//Use operator funtions to extract digits
		int hundreds = (number / 100) % 10;
		int tens = (number / 10) % 10;
		int ones = number % 10;
		int sum = ones + tens + hundreds;
		
		//Display results
		System.out.print("The sum of the digits in the number " + number + "\nis equal to " + sum);
		
	}
}
//Console output:
/* Enter an integer between 0 and 1000: 543
 * The sum of the digits in the number 543
 * is equal to 12
 */
