package String_programs;
//w.r.p to swipe string without temp variable
//input:love,you;
// output you love


public class String_swipe_without_extra_variable 
{
	public static void main(String[] args) 
	{
		String a="love";
		String b="you";
		
		System.out.println("String Before Swipe A: "+a+" B: "+b);
		a=a+b;//loveyou
		b=a.substring(0,a.length() - b.length());//0,7-3,4;love
		a=a.substring(b.length());
		System.out.println("String After Swipe A: "+a+" B: "+b);
		
	}

}
