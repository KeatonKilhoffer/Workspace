/* Purpose of the program:
 * 1. Write a program that asks the
 * user for four numbers.
 * 2. Write a program that displays
 * the four numbers.
 * 3. Write a program that prints
 * the smallest number.
 * 4. Write a program that prints
 * the largest number.
 * 5. explain how the numbers could
 * be organized in ascending order. 
 */
import java.util.Scanner;
import java.util.Arrays;
public class NumberGame {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter four numbers: ");
		
		int[] numbers = new int[4];
		
		for (int i=0; i<numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		

		System.out.println("The numbers you entered are: ");
		
		for (int x: numbers){
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.print("The highest value is: ");
		int max = numbers[0];
		for(int i=0; i < numbers.length; i++){
			if(max < numbers[i])
				{
				
				max = numbers[i];
			}
		}
		System.out.println(max);
		System.out.print("The lowest value is: ");
		int min = numbers[0];
		for (int i=0; i < numbers.length; i++){
			if (min > numbers[i]){
				
				min = numbers[i];
			}
		}
		System.out.print(min);
		int[] sortingSystem = {0, 0, 0, 0, 0, 0};
		
		for (int i=0; i < numbers.length; i++){
		
		}
			
			
	}

	
}
