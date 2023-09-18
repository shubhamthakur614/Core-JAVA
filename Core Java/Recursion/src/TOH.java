
public class TOH 
{
	public static void main(String[] args)
	{
		int n=3;
		Toh(n,"S","D","H");
		
	}
	public static void Toh(int n,String src,String des,String help)
	{
		if(n==0)
		{
			return;
		}
		Toh(n-1,src,help,des);
		System.out.println(" Move "+n+" disk from "+src+" To "+des);
		Toh(n-1,help,des,src);
	}
	

}
