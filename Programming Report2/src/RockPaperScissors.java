/* 3.17 (Rock, Paper, Scissors)
 * Write a program that:
 * 1. Assigns the variables rock, paper,
 * and scissors to an integer value.
 * 2. Produces an integer assigned to 
 * the variables to play against the user.
 * 3. Prompts user for input.
 * 4. Compares input values to rules
 * and decides a winner.
 */
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		//1.Declare and assign variables
				int rock, paper, scissors;
				rock = 1;
				paper = 2;
				scissors = 3;
				
				String yr = "You are rock. ";
				String yp = "You are paper. ";
				String ys = "You are Scissors. ";
				String cr = "Computer is rock. ";
				String cp = "Computer is paper. ";
				String cs = "Computer is scissors. ";
				String yw = "You won";
				String yl = "You lost";
				String d = "It is a draw";
				
				//2.Produce integer that is 1, 2, or 3.
				int computer = (int)(Math.random() * 3 + 1);
				
				//3.Prompt user for an input of 1, 2, or 3.
				System.out.print("Rock (1), Paper (2), "
						+ "Scissors (3): ");
				Scanner input = new Scanner(System.in);
				int userInput = input.nextInt();
				
				/*4. Write rules, compare values,
				 * and decide winner. */
				if (userInput >= 4)
					System.out.print("Wrong input");
				else if (computer == rock && userInput == scissors)
					System.out.print(cr + ys + yl);
				else if (computer == paper && userInput == rock)
					System.out.print(cp + yr + yl);
				else if (computer == scissors && userInput == paper)
					System.out.print(cs + yp + yl);
				else if (computer == rock && userInput == paper)
					System.out.print(cr + yp + yw);
				else if (computer == paper && userInput == scissors)
					System.out.print(cp + ys + yw);
				else if (computer == scissors && userInput == rock)
					System.out.print(cs + yr + yw);
				else if (computer == rock && userInput == computer)
					System.out.print(cr + yr + d);
				else if (computer == paper && userInput == computer)
					System.out.print(cp + yp + d);
				else if (computer == scissors && userInput == computer)
					System.out.print(cs + ys + d);
				

				
	}
}