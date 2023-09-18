package com.string;
//I/P: "   I Love   India   "
//O/P "India Love I" O(n) required

public class _151_stringReverse_I 
{
	public static void main(String[] args) {
		String s1 = "   I Love     India     ";
		String s2 = "   I Love     BHARAT     ";

//		bruteforce approach O(n2)
		// System.out.println(word_rev(s1));

//    modular approach of O(n) but space o(1)
		System.out.println(word_rev1(s2));

	}

	public static String word_rev(String s1) 
	{
		// I Love     BHARAT
		int i = s1.length() - 1;
		String rev = "";
		while (i > 0) {
			while (i >= 0 && s1.charAt(i) == ' ') {
				i--;
			}
			int j = i;

			while (i >= 0 && s1.charAt(i) != ' ') {
				i--;
			}
			rev = rev.concat(s1.substring(i + 1, j + 1) + " ");
		}
		return rev;
	}

	public static String word_rev1(String s2) {
  
		StringBuilder sb=new StringBuilder();
		String[] str_arr=s2.split(" ");
		int n=str_arr.length-1;
		for(int i=n;i>=0;i--)
		{
			if(!str_arr[i].equals(""))
			{
				sb.append(str_arr[i]).append(" ");
			}
		}
		return sb.length()==0?"":sb.substring(0, sb.length()-1);
	}

}
