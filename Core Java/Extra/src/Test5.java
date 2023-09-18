public class Test5 {
	public static void main(String[] args) {
		String s = "Shubham thakur";
		String[] split = s.split(" ");
		for(String sl:split)
		{
			String rev="";
			for(int i=sl.length()-1;i>=0;i--)
			{
				rev=rev+sl.charAt(i);	
			}
			System.out.print(rev+" ");
		}

	}
}
