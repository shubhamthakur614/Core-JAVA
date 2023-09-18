package com.Array;

public class Second_largest {
	public static void main(String[] args) {
		int[] arr = { 10, 35, 14, 78, 31, 49, 98, 759 };
		sec_high(arr);

	}

	public static void sec_high(int[] arr) {
		int first;
		int second;
		first = second = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
		System.out.println(second);
		}
		

	}


