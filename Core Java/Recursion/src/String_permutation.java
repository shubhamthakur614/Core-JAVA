//string permutation
//abc
//o/p
//abc,acb,bac,bca,cab,cba;3!=6 for Distinct String

public class String_permutation 
{
	static int count=0;
	public static void main(String[] args) {
		printPer("abc", "");
		System.out.println("TOTAL NO OF PERMUTATIONFROM STRINGS ARE:"+count);

	}

	public static void printPer(String que, String ans)
	{
		if (que.length() == 0)
		{
			count++;
			System.out.println(ans);
			return;
		}
		for(int i=0;i<que.length();i++)
		{
			String nq=que.substring(0,i)+que.substring(i+1);
			printPer(nq,ans +que.charAt(i));
		}
	}

}
