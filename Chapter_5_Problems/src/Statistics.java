/* Create a program that computes the mean
 * and standard deviation of ten numbers.
 * 1. declare variables to store the numbers
 * in(array variable) and to store the sum,
 * mean, deviation, and other parts of the 
 * equation to solve for deviation.
 * 1a. Prompt the user to enter 10 numbers.
 * 2. Use for-loops to store the numbers,
 * add them together, and add the squared 
 * values of the numbers together.
 * 3. separate the equation into different 
 * parts with different variables.
 * 4. Use the variable to find devation.
 * 5. Print the mean and deviation of the numbers. 
 */
import java.util.Scanner;// Imported to receive user input.

public class Statistics {
	public static void main(String[] args){
		
		// 1. Declare variables.
		double[] array = new double[10];// Stores input
		double sum = 0;//Stores the sum of the data in the array
		double mean = 0;//Stores the average value of the entered data.
		double deviation = 0;
		double numeratorRight = 0;
		double numeratorLeft = 0;
		double denomenator = 0;
		
		Scanner input = new Scanner(System.in);
		
		// 1a. Prompt user for input.
		System.out.println("Enter ten numbers");
		// 2. Use array to store numbers.
		for (int a = 0; a < array.length; a++){
			array[a] = input.nextDouble();
		}
		// Adds the entered numbers together.
		for (int a = 0; a < array.length; a++){
			sum += array[a];
		}
		// Sums the numbers together after they have been squared.
		for (int a = 0; a < array.length; a++){
			numeratorLeft += Math.pow(array[a], 2);
		}
		
		// 3. Use varables to simplify the equation.
		mean = sum/array.length;
		numeratorRight = (Math.pow(sum, 2)/array.length);
		denomenator = array.length - 1;
		
		// 4. Use correct variable to find deviation.
		deviation = Math.sqrt((numeratorLeft - numeratorRight) / denomenator);
		// 5. Print mean and deviation.
		System.out.println("The mean value of the numbers entered is: " + mean);
		System.out.println("The Standard deviation of the numbers entered is: " + deviation);
	}

}
