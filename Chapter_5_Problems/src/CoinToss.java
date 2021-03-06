/* Create a program that simulates the flipping 
 * a coin one million times and displays the
 * number of heads and tails.
 * 1. Declare variables to keep count of
 * head and tail wins.
 * 2. Use a for-loop to limit the process
 * to a million times.
 * 3. Use Math.random to produce either 0 or 1.
 * 4. Separate and count the heads from the tails
 * using a switch statement.
 * 5. Display the count for the heads and the tails.
 * 
 */
import java.util.Scanner;// Imported to receive user input.

public class CoinToss {
	public static void main(String[] args){
		
		System.out.println("Program counts the number of heads\n"
				+ "and tails that would occure if a coin\n"
				+ "was flipped a million times\n"
				+ "Press enter to continue...");
		Scanner input = new Scanner(System.in);
		input.nextLine(); //for enter key
		
		// 1. Declare head and tail variables.
		int head = 0;
		int tail = 0;
		
		// 2. for-loop to limit the process to 10000000 times.
		for (int a = 0; a < 1000000; a++){
			
			// 3. Produce two values two represent heads or tails.
			int number = (int)(Math.random() * 2);
			
			// 4. Switch counts the total heads and tails.
			switch(number){
			case 0: head++; break;
			case 1: tail++; break;
			}
			
		}
		
		// 5. Print the count of heads and tails.
		System.out.println("Heads count = " + head);
		System.out.println("Tails count = " + tail);
	
	}

}
