package com.Array;

//without sorting the array find the min and max no in array.O(N).
public class Smallest_largest {

	public static void main(String[] args) {
		int[] arr = { 193,-54, -12, 51, -3, 21,158, 1, 78, 3 };
		int[] values = minmax(arr);
		System.out.println("Minium value is: " + values[0] + " Max value is: " + values[1]);
	}

	public static int[] minmax(int[] arr) {

		int min = arr[0];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) 
			{
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		return new int[] { min, max };
	}

}

///there is also another way to passing the value using creating another class using generic

/*
 * public class Test {

	public static void main(String[] args) 
	{
		int[] arr ={-54,-12,51,-3,21,1,78,3};
		pair<Integer>p=minmax(arr);
		System.out.println("Minium value is: "+p.getFirst()+" Max value is: "+p.getSec());		
	}
	
	public static pair<Integer> minmax(int[] arr)
	{
		
		int min=arr[0];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return new pair<Integer>(min,max);
	}
		

}


class pair<T>
{
	private final T first;
	private final T sec;
	public T getFirst() {
		return first;
	}
	public T getSec() {
		return sec;
	}
	public pair(T first, T sec) {
		super();
		this.first = first;
		this.sec = sec;
	}
	
	
	
}
*/

