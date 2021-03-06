/* Determinant of a matrix program:
 * Quick Note: the program has elements that
 * may be not be nessesary 
 * 
 */
public class MatrixTest3 {
	public static void main(String[] args) {

		 double[][] matrix = { { 1, 2, 2, 3}, { 2, 1, 2, 1}, { 3, 2, 1, 1}, {
		 2, 1, 3, 2}}; // Test #1
		/*
		 * Test #1 know value
		 * 
		 */
		// double[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// double[][] matrix = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90,
		// 11, 12, 13 }, { 14, 15, 16, 17 } };
		// int[] address = new int[matrix.length]; // Not needed. old design.
		// for use with storage matrix.
		// int[][] storage = new int[(address.length - 1) * 2][(address.length -
		// 1) * 2]; // Not needed. old design.
		double[][] allocation = new double[matrix.length][matrix.length - 1];
		double sumPositiveSet = 0; // Used to find determinant definitions.
		double sumNegativeSet = 0; // Used to find determinant definitions.
		double[] positiveSet = new double[matrix.length];
		double[] negativeSet = new double[matrix.length];
		//double determinant = 1; // Will store the determinant value
		double[] definition = new double[matrix.length]; /*
															 * Stores the
															 * determinant
															 * definitions for
															 * basic addition
															 * and subtraction
															 */
		// other variables.
		double tempLocation1 = 0;
		double tempLocation2 = 0;
		double tempLocation3 = 0;
		double templocation4 = 0;
		double define = 1;
		double[][] sumSet = new double[matrix.length][matrix.length];
		double[][] basic = new double[matrix.length][matrix.length];
		
		// Allocation matrix creation.
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length - 1; column++) {
				allocation[row][column] = (column + row + 1) % matrix.length;
			}
		}

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
						double tempLocationA = allocation[row][column];
						double tempLocationB = allocation[row][(column + 1) % (matrix.length - 1)];

						allocation[row][column] = tempLocationB;
						allocation[row][(column + 1) % (matrix.length - 1)] = tempLocationA;
					}

				}
			}
		}

		for (int a = 0; a < matrix.length; a++) {
			positiveSet[a] = 1;
			negativeSet[a] = 1;
			for (int b = 1; b < matrix.length; b++) {
				sumPositiveSet = sumPositiveSet + (positiveSet[a] * matrix[0][a]);
				sumNegativeSet = sumNegativeSet + (negativeSet[a] * matrix[0][a]);

				// System.out.println(sumPositiveSet + " " + sumNegativeSet);
				if (a != 0) {
					tempLocation1 = negativeSet[a];
					tempLocation2 = positiveSet[a];
				}
				// System.out.println(" >>>> " + negativeSet[a]);
				negativeSet[a] = 1;
				positiveSet[a] = 1;

				// if(b == 3){
				// negativeSet[a] = 1;
				// positiveSet[a] = 1;
				// }
				// System.out.println(positiveSet[a]);
				// System.out.println(" ---> " + tempLocation1);
				// System.out.println(" >>>> " + negativeSet[a]);
				for (int c = 0; c < matrix.length - 1; c++) {

					double part1 = matrix[1][b];

					int forwardCounter = ((b - 1 + c) % 3);
					int backwardCounter = ((b + 1 - c) % 3);

					// System.out.print(forwardCounter + " ");
					// System.out.println(backwardCounter);
					// System.out.print((int)allocation[a][forwardCounter] + "
					// ");
					// System.out.println((int)allocation[a][backwardCounter]);
					// System.out.println(matrix[c +
					// 1][(int)allocation[a][forwardCounter]] + " ");
					// System.out.println(c + 1);
					// System.out.println(matrix[c +
					// 1][(int)allocation[a][backwardCounter]]);
					// System.out.println("positive " + positiveSet[a]);

					positiveSet[a] = positiveSet[a] * matrix[c + 1][(int) allocation[a][forwardCounter]];
					//System.out.println(positiveSet[a]);

					// Multiplies numbers
					if (c > 0) {
						negativeSet[a] = negativeSet[a] * matrix[c + 1][(int) allocation[a][backwardCounter]];
						if (c == 2){
							negativeSet[a] = negativeSet[a] * matrix[0][a] * define;
							positiveSet[a] = positiveSet[a] * matrix[0][a];
							
							sumSet[a][b] = positiveSet[a] - negativeSet[a];
							if (b == 3){
								basic[a][b] = sumSet[a][1] - sumSet[a][2] + sumSet[a][3];
								if (a == 3){
									double determinant = basic[0][a] - basic[1][a] + basic[2][a] - basic[3][a];
									System.out.println(determinant);
								}
							}
						}
					}
					if (c == 0) {
						define = matrix[c + 1][(int) allocation[a][forwardCounter]];
						 //System.out.println(" <> " + define);
					}
					// if (c == 2){
					// double positiveSetMultiplied = (define * negativeSet[a]);
					// System.out.println(positiveSetMultiplied);
					// }
					// System.out.println(positiveSet[a] + " ");
					//System.out.println(negativeSet[a]);

					//if (c == 2) {
					//	sumPositiveSet = sumPositiveSet + positiveSet[a];
					//	sumNegativeSet = sumNegativeSet + negativeSet[a];
					//}
					//if (b == 3 && c == 2) {
					//	definition[a] = matrix[0][a] * (sumPositiveSet - sumNegativeSet);
					//}

						// System.out.println(matrix[0][a]); // matrix reading
						// correctly.
						// System.out.println(sumPositiveSet);
						// System.out.println(sumNegativeSet);
						// System.out.println(definition[a]);
					//}
					//if (a == 3) {
					//	tempLocation1 = negativeSet[a];
					//}

				}
			}
		}

		//for (int a = 0; a < 4; a++) {
			//determinant = determinant + definition[a];
			// System.out.println(definition[a]);
		//}
		//System.out.println(tempLocation1);
		// System.out.print(determinant);
	}

}
