/* Determinant of a matrix program:
 * Quick Note: the program has elements that
 * may be not be nessesary 
 * 
 */
public class MatrixTest2 {
	public static void main(String[] args) {
		
		//double[][] matrix = { { 1, 2, 2, 3}, { 2, 1, 2, 1}, { 3, 2, 1, 1}, { 2, 1, 3, 2}}; // Test #1
		/* Test #1 know value
		 * 
		 */
		double[][] matrix = { { 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12}, { 13, 14, 15, 16}};
		//double[][] matrix = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 11, 12, 13 }, { 14, 15, 16, 17 } };
		// int[] address = new int[matrix.length]; // Not needed. old design.
		// for use with storage matrix.
		// int[][] storage = new int[(address.length - 1) * 2][(address.length -
		// 1) * 2]; // Not needed. old design.
		double[][] allocation = new double[matrix.length][matrix.length - 1];
		double sumPositiveSet = 0; // Used to find determinant definitions.
		double sumNegativeSet = 0; // Used to find determinant definitions.
		double[] positiveSet = new double[matrix.length];
		double[] negativeSet = new double[matrix.length];
		double determinant = 1; // Will store the determinant value
		double[] definition = new double[matrix.length]; /*
															 * Stores the
															 * determinant
															 * definitions for
															 * basic addition
															 * and subtraction
															 */

		/*
		 * Code Below: Creates the allocation matrix: A matrix that has desired
		 * integer values which will be used for reading certain positions in
		 * the original matrix and for placing them in the storage matrix. If
		 * storage matrix isn't used, the allocation matrix is still needed to
		 * read the original matrix for math calculations.
		 */
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length - 1; column++) {
				allocation[row][column] = (column + row + 1) % matrix.length;
			}
		}

		/*
		 * Code Below: Prints allocation matrix to check for errors in program.
		 * 
		 * for (int row = 0; row < matrix.length; row++) {
		 * System.out.println(""); for (int column = 0; column < matrix.length -
		 * 1; column++) { System.out.print(allocation[row][column] + ", ");
		 * 
		 * } }
		 */// <-- Remove to see allocation matrix before it is organized.

		/*
		 * Code Below: Organizes each row in the array in ascending order.
		 */
		for (int time = 0; time < allocation.length; time++) {
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < allocation.length - 2; column++) {

					if (allocation[row][column] > allocation[row][(column + 1) % (matrix.length - 1)]) {
						/*
						 * Creates a temporary location to store the data in a
						 * variable that before the
						 */
						double tempLocation1 = allocation[row][column];
						double tempLocation2 = allocation[row][(column + 1) % (matrix.length - 1)];

						allocation[row][column] = tempLocation2;
						allocation[row][(column + 1) % (matrix.length - 1)] = tempLocation1;
					}

				}
			}
		}

		/*
		 * Code Below: Prints the now organized allocation matrix to check for
		 * errors.
		 *//*
			 * System.out.println(""); System.out.println(" Allocation Matrix");
			 * System.out.println("       " + allocation.length);
			 * 
			 * for (int r = 0; r < matrix.length; r++) { System.out.println("");
			 * for (int c = 0; c < matrix.length - 1; c++) {
			 * System.out.print(allocation[r][c] + ", "); } }
			 */

		/*
		 * The below "for-loops" were designed to place the determinant of a
		 * matrix by definition (the 3x3 matrices used by each definition) into
		 * a quadrant of a larger matrix.
		 */// Example:
			// 60, 70, 80, 50, 70, 80,
			// 11, 12, 13, 90, 12, 13,
			// 15, 16, 17, 14, 16, 17,
			// 50, 60, 80, 50, 60, 70,
			// 90, 11, 13, 90, 11, 12,
			// 14, 15, 17, 14, 15, 16,

		/*
		 * for (int a = 0; a < matrix.length; a++) { address[a] = matrix[0][a];
		 * for (int b = 0; b < matrix.length - 1; b++) { for (int c = 0; c <
		 * matrix.length - 1; c++) { int upperQuadrants = (((a % 2)
		 * *(matrix.length - 1)) + c); int lowerQuadrants =
		 * ((((allocation[a][(matrix.length - 1) % 2]) % 2) * 3) + b); int
		 * determinantMatrix = matrix[b + 1][allocation[a][c]];
		 * storage[lowerQuadrants][upperQuadrants] = determinantMatrix;
		 * 
		 * } } }
		 */// <-- Remove to activate above loop.

		/*
		 * System.out.println(""); for (int row = 0; row < storage.length;
		 * row++){ System.out.println(""); for (int column = 0; column <
		 * storage.length; column++){ System.out.print(storage[row][column] +
		 * ", ");
		 * 
		 * }
		 * 
		 * }
		 */// <-- Remove to activate the print statement of the storage matrix.

		/*
		 * Code Below: The code (NOT FINISHED) is for the process of locating
		 * specific values in the storage matrix to use in finding the
		 * definitions of the determinant.
		 *
		 * System.out.println(""); for (int a = 0; a < matrix.length; a++) { for
		 * (int b = 0; b < matrix.length - 1; b++) { for (int c = 0; c <
		 * matrix.length - 1; c++) { int horizontalRead = (((b + c) % 3) + ((a %
		 * 2) * b)); int verticalRead = (int) ((((Math.pow(((a + 5) % 6), 2) %
		 * 5) % 3) * 3) + b);
		 * System.out.println(storage[verticalRead][horizontalRead]); } } }
		 */// <-- Remove along with "//" next to variable "storage" to use.

		for (int a = 0; a < matrix.length; a++) {
			positiveSet[a] = 1;
			negativeSet[a] = 1;
			for (int b = 1; b < matrix.length; b++) {
				sumPositiveSet = sumPositiveSet + (positiveSet[a] * matrix[0][a]);
				sumNegativeSet = sumNegativeSet + (negativeSet[a] * matrix[0][a]);
				
				//System.out.println(sumPositiveSet + "   " + sumNegativeSet);
				
				for (int c = 0; c < matrix.length - 1; c++) {

					int forwardCounter = ((b - 1 + c) % 3);
					int backwardCounter = ((b + 1 - c) % 3);
					
					//System.out.print(forwardCounter + "  ");
					//System.out.println(backwardCounter);
					//System.out.print((int)allocation[a][forwardCounter] + "  ");
					//System.out.println((int)allocation[a][backwardCounter]);
					System.out.println(matrix[c + 1][(int)allocation[a][forwardCounter]] + "  ");
					//System.out.println(c + 1);
					//System.out.println(matrix[b][(int)allocation[a][backwardCounter]]);
					//System.out.println("positive " + positiveSet[a]);
					
					positiveSet[a] = positiveSet[a] * matrix[c + 1][(int)allocation[a][forwardCounter]];
					negativeSet[a] = negativeSet[a] * matrix[c + 1][(int)allocation[a][backwardCounter]];
					
					//System.out.print(positiveSet[a] + "   ");
					//System.out.println(negativeSet[a]);
					
					if (c == 2) {
						sumPositiveSet = sumPositiveSet + positiveSet[a];
						sumNegativeSet = sumNegativeSet + negativeSet[a];
					}
					if (b == 3 && c == 2) {
						definition[a] = matrix[0][a] * (sumPositiveSet - sumNegativeSet);
						
						//System.out.println(matrix[0][a]); // matrix reading correctly.
						//System.out.println(sumPositiveSet);
						//System.out.println(sumNegativeSet);
						//System.out.println(definition[a]);
					}

				}
			}
		}

		for (int a = 0; a < 4; a++) {
			determinant = determinant + definition[a];
			System.out.println(definition[a]);
		}
		
		System.out.print(determinant);
	}

}
