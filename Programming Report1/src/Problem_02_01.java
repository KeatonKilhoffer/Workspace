/* 1.5: (Compute expression) 
 * Write a program that displays the 
 * result of (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)  
 */

public class Problem_02_01 {
	public static void main(String[] args){
		
		///System designed for:
		//(Compute Expression)
		//Set expression as a double
		double expression = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
		
		//Display expression to be solved
		System.out.println("The expression, (9.5 * 4.5 - 2.5 * 3)"
				+ " / (45.5 - 3.5)");
		
	    //Display solution
		System.out.print("is equal to: " + expression);
		
	}
}
//Console output:
/*The expression, (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)
 *is equal to: 0.8392857142857143 
 */
