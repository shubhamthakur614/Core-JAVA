//how many way to reach to stair if you have 5 stairs 
//you  can go by 1,2,3 step a a time

public class Stairs {
	static int count=0;
	public static void main(String[] args)
	{
		printWay(0,5,"");
		System.out.println("NO of way to go to the upstair are:"+count);

	}

	public static void printWay(int cur, int n, String way)
	{
		
		if(cur==n)
		{
			count++;
			System.out.println(way);
			return;
		}
		if(cur>n)
		{
			return;
		}
		printWay(cur+1,n,way+"1");
		printWay(cur+2,n,way+"2");
		printWay(cur+3,n,way+"3");
		

	}

}
