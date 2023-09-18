package Complecity;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringPractice {
	// Java program to rotate a
	// matrix by 90 degrees

	// An Inplace function to
	// rotate a N x N matrix
	// by 90 degrees in
	// anti-clockwise direction
	static void rotateMatrix(int N, int mat[][]) {
		// Consider all squares one by one
		for (int x = 0; x < N / 2; x++) {
			// Consider elements in group
			// of 4 in current square
			for (int y = x; y < N - x - 1; y++) {
				// Store current cell in
				// temp variable
				int temp = mat[x][y];

				// Move values from right to top
				mat[x][y] = mat[y][N - 1 - x];

				// Move values from bottom to right
				mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

				// Move values from left to bottom
				mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

				// Assign temp to left
				mat[N - 1 - y][x] = temp;
			}
		}
	}

	// Function to print the matrix
	static void displayMatrix(int N, int mat[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) throws Exception
	{
	

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ENTER THE SIZE OF AN 2-D ARRAY into M and N");
		
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int[][] mat=new int[m][n];
		int N=mat.length;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.println("ENTER THE ELEMENTS IN THE ARRAY BY INDEX NO:"+i+" "+j);
				mat[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		
		
		// displayMatrix(mat);

		rotateMatrix(N, mat);

		// Print rotated matrix
		displayMatrix(N, mat);
	}

}
