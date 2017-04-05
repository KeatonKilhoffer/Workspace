
/* Create a Program that simulates the
 * Bean Machine.
 * Program Requirements: Use Methods
 * Program Outline: 
 * 1a. When dropped, the bean will have the 
 * opportunity to fall right or left 5 times. 
 * This decision will be made using Math.random 
 * and the number will be limited to 0(left) and 1(right).
 * 1b. Method called upon for turn decision.
 * 2a. Use a for-loop that calls out the bin method 
 * 2b. The bin method counts the turns each bean makes 
 * which determines the bin that the bean landed in.
 * 3a. Call binCouter method.
 * 3b. binCounter method uses a switch statement to
 * count the number of beans in each bin.  
 * 
 */
import java.util.Scanner;

public class BeanMachineGame {

	public static int beanCount = userInputForBeanCount();
	public static int binCount = userInputForBinCount();
	public static int[] beansInBin = new int[binCount - 1];

	public static void main(String[] args) {

		// Prompt the user to press 'Enter" to start the simulation.
		System.out.println("Welcome to the Bean Machine Game");
		System.out.println("Press 'Enter' to start the simulation");
		// Scanner input = new Scanner(System.in);
		// input.nextLine();

		// Ask the user to input the amount of beans to use.

		// Ask the user to input the number of bins in which the
		// could possibly fall into.
		int[][] storage = new int[beanCount][binCount - 1]; // Stores the turns
															// made by each
															// bean.
		int[] counter = new int[beanCount]; // Stores the number of right
		// turns made to determine the bin.
		int[] bin = new int[binCount]; // Stores the number of beans in each
										// bin.
		/*
		 * 1a. For-loop stores the number of left and right turns that the bean
		 * makes.
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				storage[a][b] = direction();
			}
		}

		/*
		 * 2a. For-loop to call bin method for each bean.
		 * 
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				int c = storage[a][b];
				counter[a] = whichBin(a, b, c, beanCount);
			}
		}
		System.out.println("");
		// 3a. binCounter method counts the number of beans in each bin.
		for (int a = 0; a < beanCount; a++) {
			int binNumber = counter[a];

			binCounter(beanCount, binNumber, binCount);
		}
		for (int a = 0; a < binCount - 1; a++){
			System.out.println(beansInBin[a]);
		}
	}

	public static int userInputForBeanCount() {

		do {
			try {
				System.out.println("Enter the amount of " + "beans to be used in the simulation");
				Scanner input = new Scanner(System.in);
				int beanAmountInput = input.nextInt();
				System.out.println(beanAmountInput);
				return beanAmountInput;

			}

			catch (Exception wrongInput) {
				System.out.println("Wrong input. Enter an Interger.");
			}

		} while (true);

	}

	public static int userInputForBinCount() {
		do {
			try {
				System.out.println("Enter the amount of " + "bins to be used in the simulation");
				Scanner input = new Scanner(System.in);
				int binAmountInput = input.nextInt();
				input.close();
				System.out.println(binAmountInput);
				return binAmountInput;

			}

			catch (Exception wrongInput) {
				System.out.println("Wrong input. Enter an Interger.");
			}

		} while (true);
	}

	/*
	 * 1b. Direction method produces an integer values pertaining to 0 (left)
	 * and 1 (right).
	 */
	public static int direction() {

		int number = ((int) (Math.random() * 2));
		return number;

	}

	/*
	 * 2b. Bin method determines the bin that the bean landed in by adding the
	 * number of turns together.
	 */
	public static int whichBin(int a, int b, int c, int beanCount) {
		int[] innerMethodCounter = new int[beanCount];
		innerMethodCounter[a] = innerMethodCounter[a] + c;

		for (int d = 0; d < beanCount; d++) {
			// System.out.print(counter[a]);
		}
		return innerMethodCounter[a];
	}

	// 3b. binCounter add the number of beans in each bin.
	public static void binCounter(int beanCount, int binNumber, int binCount) {
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount; b++) {
				if (binNumber == b) {
					beansInBin[b] = beansInBin[b] + 1;

				}
			}
		}
		for (int a = 0; a < binNumber; a++) {
			System.out.println("The total number of beans in bin " + (a + 1) + " = " + beansInBin[a]);
		}
	}

}
