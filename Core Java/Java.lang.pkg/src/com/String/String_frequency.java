package com.String;

public class String_frequency {
	public static void main(String[] args) {
		String s = "SHUBHAMTHAKURISGOODGUY";
		frequency(s);

	}

	public static void frequency(String s) {
		int n = s.length();
		int[] f = new int[100];// to store the duplicates frequency

		for (int i = 0; i < n; i++) {
			f[s.charAt(i) - 'A']++;

		}
		
		for(int i=0;i<n;i++)
		{
			if(f[s.charAt(i)-'A']!=0)
			{
				System.out.print(s.charAt(i));
				System.out.print(f[s.charAt(i)-'A']+" ");
				f[s.charAt(i)-'A']=0;
			}
		}
	}

}
