/*2.2: (Compute the volume of a cylinder) 
 * Write a program that reads in the radius
 * and length of a cylinder and computes
 * the area and volume using the following
 * 
 * formulas:
 * area = radius * radius * p
 * volume = area * length
 * 
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 */

import java.util.Scanner;


	public class Problem_02_03 {
		public static void main(String[] args){
			//Create a scanner object for input later
			Scanner in = new Scanner(System.in);
			//System designed for:
			//(Compute the volume of a cylinder)
			
			//Prompt user for input of radius
			System.out.print("Enter the radius of a cylinder: ");
			double radius = in.nextDouble();
			
			//Prompt user for input of length
			System.out.print("Enter the length of a cylinder: ");
			double length = in.nextDouble();
			
			double p = Math.PI;//Math class implicitly imported
			
			//Compute the area of the cylinder base
			double area = radius * radius * p; 
			
			//Compute the volume of cylinder
			double volume = area * length;
			
			
			//Display results of area and volume
			/*Insert Math.round() to round up or down
			 * and to produce the same results as the sample run
			 */
			System.out.print("The Volume of a Cylinder with a radius "
					+ "of " + radius + " units \nand a length of " + length
					+ " units, \nhas an area of " + (int)(area*10000)/10000.0 + " units\n"
					+ "and a volume of " + (int)Math.round(volume*100)/100.0 + " units");
			
		}
}
//Console output
/* Enter the radius of a cylinder: 51
 * Enter the length of a cylinder: 64
 * The Volume of a Cylinder with a radius of 51.0 units 
 * and a length of 64.0 units, 
 * has an area of 8171.2824 units
 * and a volume of 522962.08 units
 */
