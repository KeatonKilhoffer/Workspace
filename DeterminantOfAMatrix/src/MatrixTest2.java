
public class MatrixTest2 {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 },
						   { 5, 6, 7, 8 }, 
						   { 9, 10, 11, 12 }, 
						   { 13, 14, 15, 16 } };
		int[] address = new int[matrix.length];
		int[][] storage = new int[(address.length - 1) * 2][(address.length - 1) * 2];
		int[][] allocation = new int[matrix.length][matrix.length - 1];
		// Sets 
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length - 1; column++) {
				allocation[row][column] = (column + row + 1) % matrix.length;
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			System.out.println("");
			for (int column = 0; column < matrix.length - 1; column++) {
				System.out.print(allocation[row][column] + ", ");

			}
		}
		// Organizes each row in the array in ascending order.
		for (int time = 0; time < allocation.length; time++) {
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < allocation.length - 2; column++) {

					if (allocation[row][column] > allocation[row][(column + 1) % (matrix.length - 1)]) {
						//Creates a temporary location to store the data in a variable that
						// before the 
						int tempLocation1 = allocation[row][column];
						int tempLocation2 = allocation[row][(column + 1) % (matrix.length - 1)];

						allocation[row][column] = tempLocation2;
						allocation[row][(column + 1) % (matrix.length - 1)] = tempLocation1;
					}

				}
			}
		}
		System.out.println("");
		System.out.println(" Allocation Matrix");
		System.out.println("       " + allocation.length);

		for (int r = 0; r < matrix.length; r++) {
			System.out.println("");
			for (int c = 0; c < matrix.length - 1; c++) {
				System.out.print(allocation[r][c] + ", ");
			}
		}

		for (int a = 0; a < matrix.length; a++) {
			address[a] = matrix[0][a];
			for (int b = 0; b < matrix.length - 1; b++) {
				for (int c = 0; c < matrix.length - 1; c++) {
					int upperQuadrants = (((a % 2) *(matrix.length - 1)) + c);
					int lowerQuadrants = ((((allocation[a][(matrix.length - 1) % 2]) % 2) * 3) + b);
					int determinantMatrix = matrix[b + 1][allocation[a][c]];
					storage[lowerQuadrants][upperQuadrants] = determinantMatrix;
				}
			}
		}
		
		System.out.println("");
		for (int row = 0; row < storage.length; row++){
			System.out.println("");
			for (int column = 0; column < storage.length; column++){
				System.out.print(storage[row][column] + ", ");
				
			}

		}
		System.out.println("");
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix.length - 1; b++) {
				for (int c = 0; c < matrix.length - 1; c++) {
					int horizontalRead = (((b + c) % 3) + ((a % 2) * b));
					int verticalRead = (int)((((Math.pow(((a + 5) % 6), 2) % 5) % 3) * 3) + b);
					System.out.println(storage[verticalRead][horizontalRead]);
				}
			}
		}
		
			
	}

}
