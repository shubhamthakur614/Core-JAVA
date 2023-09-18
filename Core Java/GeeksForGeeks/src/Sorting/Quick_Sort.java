package Sorting;

//time complexity is nlog n
public class Quick_Sort {

	public static int partition(int[] arr, int low, int high) 
	{//{ 7, 6, 10, 5, 9, 2, 1, 15}
		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(arr,j,i);
				

			}
		}
		swap(arr,j,low);
		
//       System.out.print(high+ " ");
		return high;

	}
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pip = partition(arr, low, high);
//			System.out.println(pip+" ");
			sort(arr, low, pip - 1);
			sort(arr, pip + 1, high);
		}

	}

	public static void print(int[] arr) {
		for (int z : arr) {
			System.out.print(z + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 6, 10, 5, 9, 2, 1, 15 };// { 10, 5, 1, 2, 9, 16, 11 };
		int n = arr.length;
		sort(arr, 0, n - 1);
		print(arr);

	}

}
