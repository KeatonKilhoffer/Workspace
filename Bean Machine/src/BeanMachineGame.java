
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

	public static int beanCount = 0;
	public static int binCount = 0;

	public static void main(String[] args) {

		// Prompt the user to press 'Enter" to start the simulation.
		System.out.println("Welcome to the Bean Machine Game");
		System.out.println("Press 'Enter' to start the simulation");
		
		Scanner EnterKey = new Scanner(System.in);
		EnterKey.nextLine();

		// Ask the user to input the amount of beans to use.
		beanCount = userInputForBeanCount();
		System.out.println(beanCount);
		// Ask the user to input the number of bins in which the
		// could possibly fall into.
		binCount = userInputForBinCount();
		System.out.println(binCount);
		
		int[] beansInBin = new int[binCount - 1];
		
		int[][] storageOfEachBeansTurn = new int[beanCount][binCount - 1]; // Stores the turns
															// made by each
															// bean.
		int[] counterOfBeanTurns = new int[beanCount]; // Stores the number of right
		// turns made to determine the bin.
		int[] bin = new int[binCount]; // Stores the number of beans in each
										// bin.
		/*
		 * 1a. For-loop stores the number of left and right turns that the bean
		 * makes.
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				storageOfEachBeansTurn[a][b] = beanDirection();
			}
		}

		/*
		 * 2a. For-loop to call bin method for each bean.
		 * 
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				counterOfBeanTurns[a] = counterOfBeanTurns[a] + storageOfEachBeansTurn[a][b];
			}
		}
		System.out.println("");
		// 3a. binCounter method counts the number of beans in each bin.
		for (int a = 0; a < beanCount; a++) {
			int tempBinLocation = bin[a];
			for(int b = 0; b < binCount; b++) {
			
				if(b == counterOfBeanTurns[a]){
					bin[b] = bin[b] + tempBinLocation;
					
				}
				
			}

		}
		for (int a = 1; a < binCount; a++){
			System.out.println("The amount of beans in bin " + a 
					+ " = " + bin[a - 1]);
		}
	}

	public static int userInputForBeanCount() {
		int beanAmountInput = 0;

		do {
			try {
				System.out.println("Enter the amount of " + "beans to be used in the simulation");
				Scanner input = new Scanner(System.in);
				beanAmountInput = input.nextInt();
				System.out.println("The number of beans to be used is: " + beanAmountInput);
				break;
			}
			catch (Exception wrongInput) {
				System.out.println("Wrong input. Enter an Interger.");
			}

		} while (true);
		return beanAmountInput;
	}

	public static int userInputForBinCount() {
		int binAmountInput = 0;
		do {
			try {
				System.out.println("Enter the amount of " + "bins to be used in the simulation");
				Scanner input = new Scanner(System.in);
				binAmountInput = input.nextInt();
				input.close();
				System.out.println("The number of bins to be used is: " + binAmountInput);
				//return binAmountInput;
				break;

			}
			catch (Exception wrongInput) {
				System.out.println("Wrong input. Enter an Interger.");
			}

		} while (true);
		return binAmountInput;
	}

	/*
	 * 1b. Direction method produces an integer values pertaining to 0 (left)
	 * and 1 (right).
	 */
	public static int beanDirection() {

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


}
