public class LoopTesting {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 1 }, { 2, 3, 4, 5 } };
		int[][] primaryStorage = new int[matrix.length - 1][matrix.length - 1];
		int[][] secondaryStorage = new int[primaryStorage.length - 1][primaryStorage.length - 1];
		int[][] address = new int[matrix.length][matrix.length];
		int[][] secondaryAddress = new int [address.length][address.length];
		boolean boundary = (matrix.length > 2 || primaryStorage.length > 2 || secondaryStorage.length > 2);

		if (boundary) {
			// Print Statement
			for (int row = 0; row < matrix.length; row++) {
				System.out.println(" ");
				for (int column = 0; column < matrix[row].length; column++) {
					System.out.print(matrix[row][column] + ", ");
				}
			}

			for (int k = 0; k < matrix.length - 1; k++) {
				for (int i = 0; i < matrix.length - 1; i++) {

					primaryStorage[k][i] = matrix[k + 1][i + 1];
					
				}
				for (int i = 0; i < matrix.length; i++)
					
					address[0][i] = matrix[0][i];
					
			}
			System.out.println("");
			//Print address
			for (int row = 0; row < address.length; row++) {
				System.out.println(" ");
				for (int column = 0; column < address[row].length; column++) {
					System.out.print(address[row][column] + ", ");
				}
			}
		}
			while (boundary) {

				

					for (int l = 0; l < primaryStorage.length - 1; l++) {
						for (int t = 0; t < primaryStorage.length - 1; t++) {

							secondaryStorage[l][t] = primaryStorage[l + 1][t + 1];
							

							for (int k = 0; k < secondaryStorage.length - 1; k++) {
								for (int i = 0; i < secondaryStorage.length - 1; i++) {

									primaryStorage[k][i] = secondaryStorage[k + 1][i + 1];

								}
							}

						}
					}
				
					

			} // <- For While Loop

			System.out.println("");
			for (int row = 0; row < primaryStorage.length; row++) {
				System.out.println(" ");
				for (int column = 0; column < primaryStorage.length; column++) {
					System.out.print(primaryStorage[row][column] + ", ");
				}
			}
			System.out.println("");
			for (int row = 0; row < secondaryStorage.length; row++) {
				System.out.println(" ");
				for (int column = 0; column < secondaryStorage.length; column++) {
					System.out.print(secondaryStorage[row][column] + ", ");
				}
			}
		
	}

}
