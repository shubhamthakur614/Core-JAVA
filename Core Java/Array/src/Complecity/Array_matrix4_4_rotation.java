package Complecity;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_matrix4_4_rotation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE SIZE OF AN M AND N");
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[m][n];
		int N = arr.length;// to calculate the length of array

		// to getting the data in array through user using BR

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("ENTER THE ELEMENTS IN ARRAY OF INDEX:" + i + " " + j);
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		//showing the original Array Matrix
		
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.print("\n");
			}
			System.out.println("\n");

		
		// pass the value to method
		rotate(n, arr);

		// to display the rotated array

		display(n, arr);

	}

	// METHOD TO ROTATE THE 2-D ARRAY IN 90 DEGREE ANTI-CLOCKWISE

	public static void rotate(int N, int[][] arr) {
		for (int i = 0; i < N / 2; i++)// i stands for COLUMN
		{
			for (int j = i; j < N - i - 1; j++) // j stands for ROWS
			{
				// this is regarding 4*4 2-D array you can use in any array

				// temp variable to store the first value at 0,0
				int temp = arr[i][j];
				arr[i][j] = arr[j][N - 1 - i];// taking the value at 0,3 and store in the 0,0
				arr[j][N - 1 - i] = arr[N - 1 - i][N - 1 - j];// move the value at 3,3 at 0,3
				arr[N - 1 - i][N - 1 - j] = arr[N - 1 - j][i];// move the value at 3,0 to 3,3
				arr[N - 1 - j][i] = temp;// finally move the value at temp into 3,0

			}
		}

	}
	
	

	// method to display array
	public static void display(int N, int[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("\n");

	}

}
