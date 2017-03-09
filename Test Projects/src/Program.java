/* Write a program that:
 * 1. Asks the user to input
 * four numbers.
 * 2. Prints back the four 
 * numbers entered.
 * 3. Prints back the smallest number.
 * 4. Prints back the biggest number.
 * 5. Prints back the numbers in
 * ascending order.
 */

import java.util.Arrays;//Import Arrays to rearrange 
						//the array in ascending order.
import java.util.Scanner;//Import Scanner to accept user input.

public class Program {
	public static void main(String[] args){
		//Create Scanner to accept user input
		Scanner input = new Scanner(System.in);
		
		//1. Ask the user to input 4 integers
		System.out.println("Enter four integers: ");
		//Define the size of an array, then use a 
		//for loop to store the input in an array.
		int[] storage = new int[4];
		for (int i=0; i<4; i++){
			storage[i] = input.nextInt(); 
		}
		System.out.print("The numbers you entered are: ");
		
		//2. Create a foreach loop to display entire array
		for ( int number: storage){
			System.out.print(number + ", ");
		}
		System.out.println("");//used to break the line
		
		//3. Find and print the minimum value
		int min = storage[0];
		for(int i=0; i<4; i++){
			if(min > storage[i]){
				
				min = storage[i];
			}
		}
		System.out.println("The minimum value is: " + min);
		
		//4. Find and print the maximum value
		int max = storage[0];
		for (int i=0; i<4; i++){
			if (max < storage[i]){
				
				max = storage[i];
			}
		}
		System.out.println("the greatest value is: " + max);
		
		//5. Print the numbers in ascending order.
		System.out.println("The numbers in ascending order are: ");
		Arrays.sort(storage);
		for (int x: storage){
		System.out.print(x + ", ");
		}
	}

}
