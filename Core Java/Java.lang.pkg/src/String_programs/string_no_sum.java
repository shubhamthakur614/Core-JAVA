package String_programs;

public class string_no_sum 
{
	public static void main(String[] args) {
		String str = "ab12bcd10defg10";
		str = str.replaceAll("[^\\d]", " ");
		str=str.trim();
		str = str.replaceAll(" +", " ");
		int sum=0;
		for(String a:str.split(" "))
		{
			 sum+=Integer.parseInt(a);
		}
		System.out.println(sum);
	}
	

}
