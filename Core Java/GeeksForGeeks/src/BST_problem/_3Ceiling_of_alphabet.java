package BST_problem;

/*
ex: input arr={'a','c','f'} target=b;

o/p c greter than target you have to find not equal to target if not found
wrap around 
like
input arr={'a','c','f'} target=z;
o/p a;

input arr={'a','c','f'} target=f;
o/p :a
*/

public class _3Ceiling_of_alphabet {
	public static void main(String[] args) 
	{
	  char[] arr= {'a','f','j'};
		char target='j';
		System.out.println(ceiling(arr,target));
	}
	public static char ceiling(char[] arr,char target)
	{
		//what if target no is greter than all no present inside array
		
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]>target)
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			} 
			
		}	
		return arr[start % arr.length];
	}

}
