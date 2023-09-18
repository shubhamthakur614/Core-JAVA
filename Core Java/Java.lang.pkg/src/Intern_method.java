//this method going to return the scp object value

public class Intern_method 
{
	public static void main(String[] args) 
	{
		String s1=new String("Shubham");
		String s2="Shubham";
		String s3=new String("Shubham");

		System.out.println(s1 == s3);
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s2.intern()==s3.intern());
		
	}
	

}
