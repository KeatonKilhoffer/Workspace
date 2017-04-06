/* Create a Program that simulates the
 * Bean Machine.
 * Program Requirements:
 * Use custom Methods that return a value.
 * Use custom Methods that are void.
 * Program Outline: 
 * 1. Prompt the user to start the simulation.
 * 2. Prompt the user to input the amount of 
 * beans to use in the simulation.
 * 3. Prompt the user to input the amount of
 * bins to use in the simulation.
 * 4. Use a custom method that returns a value
 * of either 0 or 1 to determine the direction
 * the bean falls.(right or left)
 * 5. Add the number of turns made by each bean
 * to determine the bin the bean landed in.
 * 6. Add together the number of beans in each bin.
 * 7. Call on a void method to print the results
 * of the simulation in terms of how many beans
 * are contained in which bins.
 * 
 */
import java.util.Scanner;

public class BeanMachineTest {

	public static int beanCount = 0; // Declared outside the main method to be altered by custom methods.
	public static int binCount = 0;

	public static void main(String[] args) {

		// 1. Prompt the user to press 'Enter" to start the simulation.
		System.out.println("Welcome to the Bean Machine Game");
		System.out.println("Press 'Enter' to start the simulation");

		Scanner EnterKey = new Scanner(System.in);
		EnterKey.nextLine();

		// Ask the user to input the amount of beans to use in the simulation.
		beanCount = userInputForBeanCount();// 2. User input for beanCount.
		// System.out.println(beanCount); // Used to check for the correct value.
		// Ask the user to input the number of bins in which the
		// beans could possibly fall into.
		binCount = userInputForBinCount();// 3. User input for binCount.
		//System.out.println(binCount); // Used to check for the correct value.

		int[][] storageOfEachBeansTurn = new int[beanCount][binCount - 1]; // Stores
		// Stores the each turn made by each bean
		
		int[] counterOfBeanTurns = new int[beanCount];
		/* Stores the addition of the number of right turns made 
		 * by each bean to determine the bin that the bean lands in.
		 */

		int[] beansInBin = new int[binCount]; // Stores the number of beans in each bin.

		/* 4. Double For-loop stores the number of left and right turns that the bean
		 * makes calling on a custom method to return a specific value to determine
		 * the random direction.
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				storageOfEachBeansTurn[a][b] = beanDirection();
				// System.out.println("Storage of each beans turn: " + storageOfEachBeansTurn[a][b]);
				
				/* ^-print statement used to determine if the 
				 * was holding the value returned by the method.
				 */
			}
		}
		
		/* 5. Double For-loop is used to store the addition of the turns made
		 * by each bean which would determine what bin the bean landed in.
		 */
		
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount - 1; b++) {
				counterOfBeanTurns[a] = counterOfBeanTurns[a] + storageOfEachBeansTurn[a][b];
				// System.out.println("Counter of bean turns: " + counterOfBeanTurns[a]);
				
				/* ^-print statement used to determine whether 
				 *  variable operated according to expectations. 
				 */
			}
		}
		System.out.println("");
		
		/*for (int a = 0; a < beanCount; a++) {
		 *	System.out.println(counterOfBeanTurns[a]);
		}*/
		
		/* 6. Double For-loop goes through the array that contains
		 * the information relating to what bin each bean fell into.
		 * If-statement is used to add together the number of beans
		 * in each bin by resetting the position in the array to the 
		 * new bean count every time a bean is found in that bin.
		 * 
		 */
		for (int a = 0; a < beanCount; a++) {
			for (int b = 0; b < binCount; b++) {
				if (b == counterOfBeanTurns[a]) {
					beansInBin[b] = beansInBin[b] + 1;
					// System.out.println("bin " + b + " = " + beansInBin[b]);
				}

			}

		}

		// 7. For-loop used to call on a method that prints the results of the simulation.
		for (int a = 1; a < binCount + 1; a++) {
			int numberOfBeansInBin = beansInBin[a - 1];
			printNumberOfBeansInEachBin(a, numberOfBeansInBin);
		}
	}

	public static int userInputForBeanCount() {
		int beanAmountInput = 0;

		do {
			try {
				System.out.println("Enter the amount of beans to be used in the simulation");
				System.out.println("Interger value must be less than or equal to 2,147,483,647");
				Scanner input = new Scanner(System.in);
				beanAmountInput = input.nextInt();
				System.out.println("The number of beans to be used is: " + beanAmountInput);
				break;
			} catch (Exception wrongInput) {
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
				System.out.println("Interger value must be less than or equal to 2,147,483,647");
				Scanner input = new Scanner(System.in);
				binAmountInput = input.nextInt();
				input.close();
				System.out.println("The number of bins to be used is: " + binAmountInput);
				// return binAmountInput;
				break;

			} catch (Exception wrongInput) {
				System.out.println("Wrong input. Enter an Interger.");
			}

		} while (true);
		return binAmountInput;
	}

	public static int beanDirection() {

		int number = ((int) (Math.random() * 2));
		// System.out.println(number);
		// ^-checks what number is being produced.
		return number;

	}

	public static void printNumberOfBeansInEachBin(int a, int numberOfBeansInBin) {
		System.out.println("The amount of beans in bin " + a + " = " + numberOfBeansInBin);
	}
}
