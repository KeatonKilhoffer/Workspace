public class Text {
	public static void main(String[] args){
		
		int[][] matrix = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 }, { 11, 12, 13, 14 } };
		int[][] primaryStorage = new int[(matrix.length * 2) + 1][(matrix.length * 2) + 1];
		int[][] secondaryStorage = new int[primaryStorage.length - 1][primaryStorage.length - 1];
		int[][] address = new int[matrix.length][matrix.length];
		int[][] secondaryAddress = new int [address.length][address.length];
		boolean boundary = (matrix.length > 2 || primaryStorage.length > 2 || secondaryStorage.length > 2);
		
		for(int a=0; a<matrix.length; a++){
			System.out.println("");
			for(int b=0; b<matrix.length; b++){
				System.out.print(matrix[a][b] + ", ");
			}
		}
		System.out.println("");
		
		for(int a=0; a<matrix.length; a++){
			address[0][a] = matrix[0][a];
			for(int b=0; b<matrix.length -1; b++){
				int k = b + 1;
				for(int c=0; c<matrix.length-1; c++){
					for(int d=0; d<matrix.length -1; d++){
						
						
						
						primaryStorage[b+c+d][c+d] = matrix[k][a];
						
					}
				}
			}
		}
		for(int a=0; a<primaryStorage.length; a++){
			System.out.println("");
			for(int b=0; b<primaryStorage.length; b++){
				System.out.print(primaryStorage[a][b] + ", ");
			}
		}
	}
}