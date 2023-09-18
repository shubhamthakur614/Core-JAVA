package Complecity;

public class Array_matrix_Rotation {
	public static void main(String[] args) {
		// return matrix from method
		// stored that return value into array of 2*2;
		
		

		int[][] arr = A1();
		
		//printing the Original array
		System.out.println("ORIGINAL ARRAY:");
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}

		int N = arr.length;
		for (int i = 0; i < N; i++)// for rows
		{
			for (int j = i; j < N; j++)// for column
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < N; i++)// to fold horizantally row by row
		{
			for (int j = 0; j < N / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][N - 1 - j];
				arr[i][N - 1 - j] = temp;
			}
		}

		// for printing O/P
        
		System.out.println("ROTATED ARRAY:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	// Using method to return the matrix to main method
	public static int[][] A1() {
		return new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	}

}
