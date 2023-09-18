package BST_assignment;

public class _1square 
{
	public static void main(String[] args)
	{
		int target=8;
//		System.out.println(normal(target));
		System.out.println(square(target));
		
	}
	//noramal way bruteforce approach
	public static int normal(int target)
	{
		int i=1;
		while(i*i<=target)
		{
			i++;
		}
		
		return i-1 ;
	}

	public static int square(int target)
	{
		
		int start=1;
		int end=target;
		int ans=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(mid<=target/mid)
			{
				ans=mid;
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return ans;
	}
}
