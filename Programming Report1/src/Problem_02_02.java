/*1.7: (Approximate pi)Estimate pi 
 * with the first 4 terms of a series. 
 * pi can be approximated as 
 * 4 * (+1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) 
 * Write a program to estimate pi.
 */
public class Problem_02_02 {
	public static void main(String[] args){
		//System designed for:
		//(Approximate pi)
		//Display expression to be estimated
		System.out.println("pi can be approximated as:\n"
				+ " 4 * ((1/1f) - (1/3f) + (1/5f) - (1/7f))");
		
		//Display results
		System.out.print("which equals " + 4 * ((1/1f) - (1/3f) + (1/5f) - (1/7f)));
	}
}
//Console output:
/* pi can be approximated as:
 * 4 * ((1/1f) - (1/3f) + (1/5f) - (1/7f))
 * which equals 2.895238
 */