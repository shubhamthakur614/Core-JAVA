package Complecity;

public class Element_as_leader 
{
	public static int legend(int[] arr,int n)
	{
//		traditional way time complexity o(n^2);
//		int s=0,j;
//		for(int i=0;i<n;i++)
//		{
//			for(j=i+1;j<n;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					break;
//				}
//				
//			}
//			if(j==n)
//			{
//				s=s+arr[i];
//			}
//		}
//		return s;
		int sum=arr[n-1];
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				sum=sum+max;
				
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] arr= {16,17,3,4,5,2};
		int n=arr.length;
		int sum=legend(arr,n);
		
		System.out.println(sum);
		
	}

}
