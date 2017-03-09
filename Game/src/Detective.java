

import java.util.Scanner;

public class Detective {
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
		System.out.println("   -Create a Matrix-");
		System.out.print("Enter the number of rows: ");
			int row = input.nextInt();
		System.out.print("Enter the number of columns: ");
			int column = input.nextInt();
		System.out.println("The size of the Matrix is " + row
				+ " x " + column);
			
		int[][] matrix = new int[row][column];
		
		for(int i=0; i<matrix.length; i++){
			int position1 = (int)(Math.random() * 100);
			if(position1>10){
				matrix[i][0] = position1;
			}
			else{
				matrix[i][0] = position1 + 10;
			}
			for(int k=0; k<matrix[i].length; k++){
				int position2 = (int)(Math.random() * 100);
				if(position2>10){
					matrix[i][k] = position2;
				}
				else{
					matrix[i][k] = position2 + 10;
				}
			}
		}
		
		for(int m=0; m<matrix.length; m++){
			System.out.println(" ");
			for(int l=0; l<matrix[m].length; l++){
				System.out.print(matrix[m][l] + ", ");
			}
		}
	}
}
