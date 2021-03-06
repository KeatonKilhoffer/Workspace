
/* Create a program that plays rock, paper,
 * scissors.
 * This program will need to:
 * 1. declare variables that will be used in
 * storing values for computer and user
 * guesses and score.
 * 1a. Form a while loop (a do-while could
 * be used but is not necessary) around the 
 * next elements of code that will determine
 * the winner (to win, score must be 2 greater
 * than opponent's score)
 * 2. determine the computer and user guesses
 * with Math.random and the Scanner class.
 * 3. Compare the guesses using if-else Statements.
 *  Assign the winner a point
 * 4. Show current Score.
 * 5. Quit the program when one opponent
 * is two points ahead of the other.
 * 6. Show the results of the game.
 */

import java.util.Scanner;// Imported to receive user input.

public class RPC {
	public static void main(String[] args){
		
		System.out.println("Lets play a game of Rock,"
				+ " Paper, Scissors!\n" +
				"     Win by a lead score of 2 points!\n");
		System.out.println("	     Pick a number:");
		System.out.println("		1 = Rock\n"
				+ "		2 = Paper\n"
				+ "		3 = Scissors");
		// 1. declare needed variables
		// Keeps track of guesses and scores.
		int playerGuess;
		int computerGuess;
		int playerScore = 0;
		int computerScore = 0;
		int counter = 0;
	
		
		// 1a. Use a while-loop to continue the game
		// until one opponent is ahead of the other by 2 points.
		while (true){
			
			counter++;// To keep up with the number of rounds
			
			// 2. Determine guesses
			do {
				try{
					computerGuess = (int)(Math.random()*3)+1;//computer guess
					Scanner input = new Scanner(System.in);//Scanner for user guess
					System.out.print(" 	   --->  ");
					playerGuess = input.nextInt();//player guess
					System.out.println("");
					break;
			
				}
				catch (Exception e){
					System.out.println("");
					System.out.println("   	That type of input is incorrect\n"
							+ "      	Enter either 1, 2, or 3");
				}
			} while(true);
			
			// 3. Compare the guesses using if-else Statements.
			if (playerGuess != 1 && playerGuess != 2 && playerGuess != 3){
				System.out.println("	      Wrong integer input\n"
						+ "	    Enter either 1, 2, or 3");
				counter--;
			}
			else { switch((playerScore*3)-computerScore){
				case 0: System.out.print("You Win"); playerScore++; break;
				case 1: System.out.print("You Lose"); computerScore++; break;
				case 2: System.out.print("Tie"); break;
				case 3: System.out.print("You Win"); playerScore++; break;
				case 4: System.out.print("Tie"); break;
				case 5: System.out.print("You Lose"); computerScore++; break;
				case 6: System.out.print("Tie"); break;
				case 7: System.out.print("You Win"); playerScore++; break;
				case 8: System.out.print("You Lose"); computerScore++; break;
			}
			// 4. Prints current score.
			System.out.println("");
			System.out.println("	   The current Score is:");
			System.out.println("   Player: " + playerScore + 
					"		Computer: " + computerScore + "\n");
			
			// 5. Determines whether to end the loop or not.
			if(Math.abs(playerScore - computerScore) < 2){
				System.out.println("		 Round " + counter);
			}
			else {
				break;
			}
			}//Bracket for else on line 91.
			
		}
		
		// 6. Prints the results of the game.
		if (playerScore > computerScore){
			System.out.println("		You Won!\n");
		}
		else {
			System.out.println("		You Lost!\n");
		}
		
		// Status.
		System.out.print("Score:");
		System.out.println("		Player: " + playerScore);
		System.out.println("       	      Computer: " + computerScore);
		System.out.println("Rounds:  " + (counter - 1));
		
	}

}