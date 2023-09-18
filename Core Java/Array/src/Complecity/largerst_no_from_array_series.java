package Complecity;
//same logic for the no which is not in array but which is in normal integer
//what we do pass that no to function
//then create an new hash[] array of size 10;
//then while loop and
//while(no>0){
///int rem=no%10;
//hash[rem]++;
//no/=10;
//and printing is same
//}

public class largerst_no_from_array_series
{
	
	// Function to generate
		// largest possible number
		// with given digits
		static void findMaxNum(int arr[],
		                       int n)
		{
		// Declare a hash array of
		// size 10 and initialize
		// all the elements to zero
		int []hash = new int[10];
		 
		// store the number of occurrences
		// of the digits in the given array
		// into the hash table
		for(int i = 0; i < n; i++)
		{
		    hash[arr[i]]++;//0011100101
		}
		 
		// Traverse the hash in descending
		// order to print the required number
		for(int i = 9; i >= 0; i--)
		{
		    // Print the number of
		    // times a digits occurs
		    for(int j = 0; j < hash[i]; j++)
		        System.out.print(i);
		}
		}
		 
		public static void main(String[] args)
		{
		    int arr[] = {4, 7, 9, 2, 3};
		     
		    int n = arr.length;
		     
		    findMaxNum(arr,n);
		}

}
